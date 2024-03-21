package com.zxy.sqlinject;

import com.zxy.config.Config;
import com.zxy.config.ExecuteQuery;
import com.zxy.config.JDConnection;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-10:16
 * @Description:
 * sql注入类
 */
public class sqlInject {

    public static void main(String[] args) {
        /**
         * url
         */
        JDConnection con = Config.
                getJDConnection("jdbc:mysql://localhost:3306/zxy?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai",
                        "root", "000328");
        ExecuteQuery executeQuery = new ExecuteQuery();

        /**
         * AND的优先级比OR高
         *
         * SELECT * FROM table
         * WHERE column1 = 'value1'  OR  column2 = 'value2' AND column3 = 'value3'
         * 在没有使用括号来明确优先级的情况下，AND 的优先级比 OR 更高，因此上面的语句将被解释为：
         *
         * SELECT * FROM table
         * WHERE column1 = 'value1' OR (column2 = 'value2' AND column3 = 'value3')
         */

        String name =  " zxy' or  '1' = '1' -- ";
        /**
         * 这个 -- 会注释掉后面的sql语句
         * 当sql是字符串拼接时，恶意的拼入特殊字符，逻辑运算，注释符号等
         * 利用符号的匹配使得sql语句的逻辑发生变化，从而达到攻击的目的
         */
        String password="123456";
        String sql = "select * from user where  user_name = '" +
                name +
                "' and user_password = '" +
                password + "'";
        executeQuery.executeQueryNoPrepared("111111");
        System.out.println(sql);
        /**
         *
         *  数据库支持预编译功能，但是JDBC的预编译功能是在客户端实现的，不是在数据库实现的
         *  SQL转义在 preparedStatement.setString 方法调用的时候完成
         *  而 PreparedStatement 在发起请求前就把转义后的参数和 SQL 模板进行了格式化，最后发送到 MySQL 的时候就是一条普通的 SQL。
         *
         *  鉴于此，我们可以说 MySQL 提供的 PreparedStatement 在默认情况下是假的“预编译”
         *  它只不过在设置参数的时候帮我们对参数做了一下转义，但是最后发送到数据库的依然是普通的 SQL
         *  而不是数据库预编译 SQL 的方式去执行
         *
         *  例如 拼接的参数zxy' 这里使用预编译参数注入setString(), 会自动变成 ' zxy' '
         *  强制安装参数的格式注入，不是直接拼接到sql语句中
         */
        String sqlPrepared = "select * from user where  user_name = ?   and user_password =  ? ";
    }

}
