/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 16:20:31
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 16:20:54
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class FirstLevelKind extends BaseEntity {
    private BigInteger comId;
    private String kind;
}
