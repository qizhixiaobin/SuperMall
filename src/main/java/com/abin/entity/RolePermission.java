/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 14:46:05
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 14:46:42
 */
package com.abin.entity;

import java.math.BigInteger;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class RolePermission {
    private Integer rolId;
    private BigInteger perId;
}
