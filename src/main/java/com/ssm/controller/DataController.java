package com.ssm.controller;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.ssm.entity.TestEnt;
import com.ssm.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

@CrossOrigin
@RestController
public class DataController {

    @Autowired
    TestMapper testMapper;

    @ResponseBody
    @RequestMapping("/test")
    public String test() throws SQLException {
        return testMapper.SelectTestEnt().toString();
    }
}
