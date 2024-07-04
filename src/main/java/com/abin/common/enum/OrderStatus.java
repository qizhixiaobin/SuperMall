/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 15:14:57
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 15:45:47
 */
package com.abin.common.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {
    UNPAID(0, "未支付"),
    WAITFORRECEIVING(1, "待收货"),
    DONE(2, "已完成"),
    CANCELED(3,"已取消");
    private Integer code;
    private String desc;

}
