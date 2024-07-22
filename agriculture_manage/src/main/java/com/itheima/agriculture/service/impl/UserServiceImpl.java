package com.itheima.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.agriculture.entity.User;
import com.itheima.agriculture.mapper.UserMapper;
import com.itheima.agriculture.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
