/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 11:52:39
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 17:12:00
 */
package com.abin.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JsonResponse {
    // 状态码：0：失败，1：成功
    private Integer code;
    // 返回信息
    private String msg;
    // 返回数据
    private Object data;

    public JsonResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResponse(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static final JsonResponse success(String msg, Object data) {
        return new JsonResponse(1, msg, data);
    }

    public static final JsonResponse success(String msg) {
        return new JsonResponse(1, msg);
    }

    public static final JsonResponse success() {
        return new JsonResponse(1, "操作成功");
    }

    public static final JsonResponse success(Object data) {
        return new JsonResponse(1, data);
    }

    public static final JsonResponse error(String msg, Object data) {
        return new JsonResponse(0, msg, data);
    }

    public static final JsonResponse error(String msg) {
        return new JsonResponse(1, msg);
    }
}
