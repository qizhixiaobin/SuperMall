/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 16:39:27
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 16:39:31
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Cart extends BaseEntity{
    private BigInteger comId;
    private Integer num;
}
