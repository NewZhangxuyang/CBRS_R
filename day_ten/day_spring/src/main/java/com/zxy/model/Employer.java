package com.zxy.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-15:45
 * @Description: 雇员类
 * <p>
 * <p>
 * 对应的数据库表
 * <p>
 * create table emp
 * (
 * emp_no    int,
 * emp_name  varchar(20),
 * job       varchar(13),
 * mgr       int,
 * hire_date datetime,
 * sal       numeric(8, 2),
 * comm      decimal(8, 2),
 * dept_no   int,
 * primary key (emp_no),
 * foreign key (dept_no) references dept (dept_no) on delete cascade on update cascade
 * ) default character set utf8;
 */

public class Employer {
    private int empNo;
    private String empName;
    private String job;
    private int mgr;
    private String hireDate;
    private double sal;
    private double comm;
    private int deptNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Employer{" + "empNo=" + empNo + ", empName='" + empName + '\'' + ", job='" + job + '\'' + ", mgr=" + mgr + ", hireDate='" + hireDate + '\'' + ", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + '}';
    }


}
