/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 16:40:56
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 16:45:06
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Address extends BaseEntity {
    private BigInteger userId;
    private String province;
    private String city;
    private String district;
    private String detail;
    private String addressee;
    private String tele;
}
