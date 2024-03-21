package com.zxy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-18:03
 * @Description: mybatis 整合spring配置类
 */

@Configuration
@PropertySource("classpath:datasource.properties")
public class mybatisConf {

    @Value("${datasource.driver}")
    private String driverClassName;

    @Value("${datasource.url}")
    private String url;

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.maxActive}")
    private int maxActive;


    @Value("${datasource.minIdle}")

    private int minIdle;

    @Value("${datasource.maxWait}")
    private int maxWait;


    @Bean
    public DataSource getDataSource() {
        /**
         * @Bean  spring会自动找到符合方法参数的对象，注入到方法中
         */
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(maxActive);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxWait(maxWait);
        return dataSource;
    }
    /**
     * sqlSessionFactory
     * 用于创建SqlSession，SqlSession用于执行sql语句，获取映射器等，是mybatis的核心
     * @Bean在方法上，  spring会从容器中，将方法参数的值注入到方法中
     * 按照类型注入
     */
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactory( DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        /**
         * 设置mybatis的xml所在位置, 使用配置类的方式，需要使用PathMatchingResourcePatternResolver
         *
         * Resource是spring的资源抽象，可以是文件系统，类路径，url等
         * PathMatchingResourcePatternResolver是ResourceLoader的实现类
         * 就是读取资源，加载资源，尤其是xml文件
         *
         *
         * 这里的classpath: 代表的是类路径，也就是resources目录
         * 例如：classpath:mapper/*.xml 代表的是resources目录下的mapper目录下的所有xml文件
         *
         * .xml和.XML 不能匹配到一起的
         */
        sqlSessionFactoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().
                        getResources("classpath:mapper/*.xml"));
        return sqlSessionFactoryBean;
    }

}
