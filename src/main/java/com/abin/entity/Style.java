/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 14:41:37
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 14:43:07
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Style extends BaseEntity {
    private BigInteger labId;
    private String style;
}
