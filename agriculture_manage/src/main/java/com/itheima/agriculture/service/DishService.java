package com.itheima.agriculture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.agriculture.dto.DishDto;
import com.itheima.agriculture.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {

    //新增产品，同时插入产品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询产品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新产品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);
    //根据传过来的id批量或者单个的删除菜品
    void removeById(List<Long> ids);

}
