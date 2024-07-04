/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 16:16:42
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 16:16:46
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Label extends BaseEntity {
    private BigInteger comId;
    private String label;
}
