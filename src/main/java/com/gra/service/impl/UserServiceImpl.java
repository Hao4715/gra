package com.gra.service.impl;

import com.gra.mapper.UserMapper;
import com.gra.pojo.User;
import com.gra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByUserName(String userName) {
        return userMapper.queryByUserName(userName);
    }
}
