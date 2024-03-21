package com.zxy.dao;

import com.zxy.model.Employer;

import java.util.List;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-16:49
 * @Description:
 */
public interface EmployerDao {

    /**
     * 查询所有员工
     */
    List<Employer> queryAllEmployer();

    /**
     * 查询员工
     */
    Employer queryEmployer(int id);

    /**
     * 添加员工
     */
}
