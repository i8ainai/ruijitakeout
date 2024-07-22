package com.itheima.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.agriculture.entity.OrderDetail;
import com.itheima.agriculture.mapper.OrderDetailMapper;
import com.itheima.agriculture.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}