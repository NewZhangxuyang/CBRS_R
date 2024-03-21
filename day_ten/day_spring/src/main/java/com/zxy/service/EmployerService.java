package com.zxy.service;

import com.zxy.model.Employer;

import java.util.List;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-16:45
 * @Description:
 *    员工服务接口
 */
public interface EmployerService
{
    /**
     * 查询所有员工
     */
    List<Employer> queryAllEmployer();

    /**
     * 查询员工
     */
    void queryEmployer(int id);



}
