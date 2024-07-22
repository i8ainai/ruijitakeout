package com.itheima.agriculture.dto;

import com.itheima.agriculture.entity.Setmeal;
import com.itheima.agriculture.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
