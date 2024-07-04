/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 15:02:36
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 15:02:40
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Order extends BaseEntity{
    private BigInteger userId;
    private BigInteger comId;
    private Integer price;
    private Integer num;
    private Integer status;
    private String detail;

}
