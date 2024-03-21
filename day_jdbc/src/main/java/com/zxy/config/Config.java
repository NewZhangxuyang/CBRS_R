package com.zxy.config;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-14-14:48
 * @Description:
 */
public class Config {

    private static JDConnection jdConnection = null;

    public static  JDConnection getJDConnection( String url, String username, String password){
        if (jdConnection == null) {
            jdConnection = JDConnection.getJdConnection( url, username, password);
        }
        return jdConnection;
    }

    protected static Statement getStatement() {
        Statement statement = null;
        try {
             statement = jdConnection.getConnection().createStatement();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  statement;
    }
    protected static PreparedStatement getPreparedStatement(String sql) {
        PreparedStatement statement = null;
        try {
            statement = jdConnection.getConnection().prepareStatement(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  statement;
    }

}
