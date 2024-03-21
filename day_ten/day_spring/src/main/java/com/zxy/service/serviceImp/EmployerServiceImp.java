package com.zxy.service.serviceImp;

import com.zxy.dao.EmployerDao;
import com.zxy.model.Employer;
import com.zxy.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-16:45
 * @Description:
 */

@Service
public class EmployerServiceImp implements EmployerService {


    @Autowired
    EmployerDao employerDao;


    @Override
    public List<Employer> queryAllEmployer() {
        return employerDao.queryAllEmployer();

    }

    @Override
    public void queryEmployer(int id) {

        employerDao.queryEmployer(id);
    }
}
