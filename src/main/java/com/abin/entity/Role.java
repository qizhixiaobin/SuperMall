/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 14:59:08
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 14:59:30
 */
package com.abin.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Role {
    private String role;
    private Integer level;
}
