package com.ffzhello.mix.api;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author ffzhello
 * @since 2020/6/13
 * @description Api通用处理层
 *              1、负责接收/响应外部接口调用
 *              2、现场记录
 **/
@RestController
public class MixApi {

    public String handle() {
        // TODO 获取请求参数，调用响应的处理器
        // TODO 现场记录
        return "hello";
    }
}
