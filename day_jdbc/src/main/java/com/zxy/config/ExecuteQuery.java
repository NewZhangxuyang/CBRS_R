package com.zxy.config;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-14-15:47
 * @Description:
 */
public class ExecuteQuery {
    private static Statement statement;


    static {
        statement = Config.getStatement();
    }


    public void executeQueryNoPrepared(String sql) {

        if (sql == null || sql.isEmpty()) {
            throw new RuntimeException("sql is null");
        }
        try {
            ResultSet resultSet = statement.
                    executeQuery("select  emp_name  as name ,count(emp_no)  as no_count,count(emp_name) as  name_count\n" +
                            "from emp  group by name having name_count > 1  limit 20 ");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " +
                        resultSet.getString("no_count") + ""
                        + resultSet.getString("name_count"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void executeQueryPrepared(String sql) {
        /**
         * select  * from  emp where  emp_no  in () limit
         */
        PreparedStatement preparedStatement = Config.getPreparedStatement(sql);
        try {
            preparedStatement.setInt(1, 800);
            preparedStatement.setInt(2, 700);
            preparedStatement.setInt(3, 20);
            System.out.println("----------------------->" + preparedStatement.toString());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("emp_no") + " " +
                        resultSet.getString("emp_name") + ""
                        + resultSet.getString("sal"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void executePreparedUpdate(String sql, int emp_num) {
        PreparedStatement preparedStatement = Config.getPreparedStatement(sql);
        try {
            preparedStatement.setInt(1, emp_num);
            int i = preparedStatement.executeUpdate();
            System.out.println("row  result  success   "+ i + "------->" + preparedStatement);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
