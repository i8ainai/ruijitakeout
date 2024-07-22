package com.itheima.agriculture.dto;

import com.itheima.agriculture.entity.Dish;
import com.itheima.agriculture.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    //产品对应的口味数据
    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
