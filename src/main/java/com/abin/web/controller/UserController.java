/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 18:35:12
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 18:36:19
 * RESTful API风格
 * ·GET     查
 * ·POST    增
 * ·PUT     改
 * ·DELETE	删
 */
package com.abin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.abin.service.IUserService;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

}
