package com.zxy.config;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-14-14:46
 * @Description:   数据库连接封装类
 */
public final   class JDConnection  implements Comparable<JDConnection> {

    private String url;
    private String username;
    private String password;
    private Connection connection = null;

    /**
     * lazy单例模式
     */
    private static JDConnection jdConnection = null;

    private JDConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.getConnection();
    }

    private JDConnection() {
    }


    /**
     * lazy单例模式
     * protected 修饰符的方法可以被子类访问,但是不能被包外的类访问
     * default修饰符的方法可以被同一个包内的类访问
     *
     */
    protected static JDConnection getJdConnection( String url, String username, String password) {
        if (jdConnection == null) {
            jdConnection = new JDConnection( url, username, password);
        }
        return jdConnection;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "JDConnection{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}'+connection.toString();
    }


    public  int  compareTo(JDConnection jdConnection){
        return this.url.compareTo(jdConnection.url);
    }


    protected Connection getConnection() {

        /**
         * 连接mysql数据库
         */
        try {
            /**
             * 在Class.forName加载完驱动类，开始执行静态初始化代码时，会自动新建一个Driver的对象
             * 并调用DriverManager.registerDriver把自己注册到DriverManager中去
             */
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
