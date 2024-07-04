/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 16:18:59
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 16:19:03
 */
package com.abin.entity;

import java.math.BigInteger;

import com.abin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class KindCommodity extends BaseEntity {
    private Integer secId;
    private BigInteger comId;
}
