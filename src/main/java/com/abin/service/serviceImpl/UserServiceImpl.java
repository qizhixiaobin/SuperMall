package com.abin.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.abin.entity.User;
import com.abin.mapper.UserMapper;
import com.abin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{

}
