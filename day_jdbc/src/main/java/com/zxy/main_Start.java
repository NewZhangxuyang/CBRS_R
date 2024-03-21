package com.zxy;

import com.zxy.config.Config;
import com.zxy.config.ExecuteQuery;
import com.zxy.config.JDConnection;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-14-14:34
 * @Description:
 */
public class main_Start {

    /**
     * JDBC是Java DataBase Connectivity的缩写，即Java数据库连接
     * JDBC是一种用于执行SQL语句的Java API，是一种规范
     * <p>
     * 隐藏了不同数据库的差异，使得Java程序员可以用一套统一的接口编程，而不用考虑不同数据库的差异
     * 可以为多种关系数据库提供统一访问，它由一组用Java语言编写的类和接口组成
     * <p>
     * JDBC的主要功能是：建立连接、发送SQL语句、处理结果集合
     * 具体的实现是由数据库厂商提供的，不同的数据库厂商提供不同的实现
     */

    public static void main(String[] args) {
        /**
         * 1.加载驱动 Class.forName("com.mysql.jdbc.Driver");
         * 有些驱动在初始化的时候会自动注册，不需要手动注册
         *
         * 2.建立连接 DriverManager.getConnection(url,username,password);
         *  url:数据库的地址   username:用户名   password:密码
         *
         *
         *
         * 3.创建语句  Statement statement = connection.createStatement();
         * PreparedStatement preparedStatement = connection.prepareStatement(sql);
         * Statement 用于执行静态SQL语句
         * PreparedStatement 用于执行动态SQL语句，可以使用动态参数
         *
         *
         * 4.执行语句 ResultSet resultSet = statement.executeQuery(sql);
         * ResultSet resultSet = preparedStatement.executeQuery();
         *  executeQuery() 用于执行查询语句
         *  用于执行DQL语句，返回值为ResultSet类型
         *
         *  executeUpdate() 用于执行更新语句
         *  用于执行DML语句，返回值为int类型
         *
         *
         *  execute() 用于执行任何SQL语句
         *  可用于执行任何SQL语句，返回一个boolean值，表明执行该SQL语句是否返回了ResultSet
         *
         *
         *
         * executeQuery(String sql)：运行select语句，返回ResultSet结果集。
         * executeUpdate(String sql)：运行insert/update/delete操作，返回更新的行数
         *
         *
         *
         * 5.处理结果
         * resultSet.next()
         * resultSet.getString("");
         * resultSet.getInt("");
         * resultSet.getDouble("");
         * .......
         *
         *  resultSet.getArray("")  是获取某一列的数组
         * 6.关闭连接
         */

        /**
         * url
         */
        JDConnection con = Config.
                getJDConnection("jdbc:mysql://localhost:3306/zxy?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai",
                        "root", "000328");
        ExecuteQuery executeQuery = new ExecuteQuery();
        executeQuery.executeQueryNoPrepared("111111");
       executeQuery.executeQueryPrepared("select * from  emp  where  emp_no  in (?,?) limit ? ");
        executeQuery.executePreparedUpdate("update emp set sal = 100000.00 where emp_no = ? ", 800);
        con.closeConnection();


    }


}
