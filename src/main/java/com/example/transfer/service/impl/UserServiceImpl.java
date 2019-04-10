package com.example.transfer.service.impl;

import com.example.transfer.dao.UserMapper;
import com.example.transfer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @Auther: liwang
 * @Date: 2019/4/10 21:40
 * @Description:
 */
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public int addTest() {
        return userMapper.addTest();
    }
}
