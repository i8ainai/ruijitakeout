package com.itheima.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.agriculture.entity.AddressBook;
import com.itheima.agriculture.mapper.AddressBookMapper;
import com.itheima.agriculture.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
