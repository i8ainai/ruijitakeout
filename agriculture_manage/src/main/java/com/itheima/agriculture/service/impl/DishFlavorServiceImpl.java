package com.itheima.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.agriculture.entity.DishFlavor;
import com.itheima.agriculture.mapper.DishFlavorMapper;
import com.itheima.agriculture.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
