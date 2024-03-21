package com.zxy.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-18:06
 * @Description:
 */
@Configuration
@ComponentScan("com.zxy")
@MapperScan("com.zxy.dao.**")
public class springConf {
}
