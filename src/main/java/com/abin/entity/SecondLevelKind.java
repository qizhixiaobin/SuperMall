/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 14:43:41
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 14:43:45
 */
package com.abin.entity;

import java.math.BigInteger;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SecondLevelKind {
    private Integer firId;
    private BigInteger comId;
    private String kind;
}
