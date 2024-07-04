/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 16:30:08
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 16:30:12
 */
package com.abin.entity;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Commodity extends BaseEntity {
    private String name;
    private Integer price;
}
