package com.itheima.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.agriculture.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}