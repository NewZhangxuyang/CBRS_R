package com.zxy.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-15:48
 * @Description: 部门类
 * <p>
 * 对应的数据库表
 * create table dept
 * (
 * dept_no   int,
 * dept_name varchar(20),
 * dept_loc  varchar(13),
 * primary key (dept_no)
 * ) default character set utf8;
 */
public class Department {
    private int deptNo;
    private String deptName;
    private String deptLoc;

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptLoc() {
        return deptLoc;
    }

    public void setDeptLoc(String deptLoc) {
        this.deptLoc = deptLoc;
    }

    @Override
    public String toString() {
        return "Department{" + "deptNo=" + deptNo + ", deptName='" + deptName + '\'' + ", deptLoc='" + deptLoc + '\'' + '}';
    }
}
