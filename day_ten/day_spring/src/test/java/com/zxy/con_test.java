package com.zxy;

import com.zxy.config.springConf;
import com.zxy.controller.EmlController;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-16:53
 * @Description: spring集成Mybatis测试
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {springConf.class})
public class con_test {


    /**
     * 基本作用域singleton（单例）、prototype(多例)
     * web作用域request、session、global session
     *
     * request：同一个请求创建一个实例
     * session：同一个session创建一个实例
     * global session：同一个全局session创建一个实例
     */
    @Autowired
    private EmlController emlController;

    @Test
    public void queryAllEmployer() {
        String s= emlController.queryAllEmployer();
        System.out.println("查询所有员工" + s);
    }




}
