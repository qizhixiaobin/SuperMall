/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 14:25:04
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 17:29:42
 */
package com.abin.common.base;

import java.io.Serializable;
import java.math.BigInteger;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;

import lombok.Data;

@Data
public class BaseEntity implements Serializable {
    // 主键id自增
    @TableId(type = IdType.AUTO)
    private BigInteger id;
    private String createTime;
    private String updateTime;
    // 逻辑删除
    @TableLogic
    private String isDelete;
}
