package com.gaodev.springbootstudy.service.impl;

import com.gaodev.springbootstudy.mapper.UserMapper;
import com.gaodev.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;




}
