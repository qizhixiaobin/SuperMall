/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 14:24:24
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 14:40:48
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {
    private BigInteger carId;
    private Integer RolId;
    private String email;
    private String password;
    private String gender;
    private String account;
    private String tele;
    private String nickname;
    private String imgUrl;
    private String realName;
    private String idCard;
    private String birthday;
}
