package com.itheima.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.agriculture.entity.Employee;
import com.itheima.agriculture.mapper.EmployeeMapper;
import com.itheima.agriculture.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
