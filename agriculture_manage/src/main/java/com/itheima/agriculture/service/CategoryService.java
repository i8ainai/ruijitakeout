package com.itheima.agriculture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.agriculture.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
