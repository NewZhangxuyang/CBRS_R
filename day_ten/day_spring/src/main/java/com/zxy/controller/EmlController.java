package com.zxy.controller;

import com.alibaba.fastjson.JSON;
import com.zxy.model.Employer;
import com.zxy.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-15-18:09
 * @Description:
 */
@Controller
public class EmlController {


    @Autowired
    private EmployerService employerService;

    public String queryAllEmployer() {
        /**
         * List转化为json
         */
        String result = JSON.toJSONString(employerService.queryAllEmployer());
        return  result ;
    }

}
