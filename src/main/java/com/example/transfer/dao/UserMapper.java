package com.example.transfer.dao;

import com.example.transfer.entity.User;
import com.example.transfer.mappers.MyMapper;

public interface UserMapper extends MyMapper<User> {
    int addTest();
}