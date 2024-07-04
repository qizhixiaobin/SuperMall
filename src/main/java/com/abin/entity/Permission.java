/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 15:00:36
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 15:00:39
 */
package com.abin.entity;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Permission extends BaseEntity{
    private String permisson;
    private String url;
    private Integer level;
}
