/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 16:36:44
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 16:36:49
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Comment extends BaseEntity{
    private BigInteger comId;
    private BigInteger userId;
    private String comment;
}
