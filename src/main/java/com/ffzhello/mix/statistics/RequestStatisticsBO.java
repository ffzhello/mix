package com.ffzhello.mix.statistics;

import lombok.Data;

/**
 * @author ffzhello
 * @since 2020/6/21
 **/
@Data
public class RequestStatisticsBO {

    /**
     * 客户端信息(调用方)
     * 服务名
     **/
    private String clientAppName;

    /**
     * 服务端信息(被调用方)
     * 服务名
     **/
    private String serverAppName;

    /**
     * 接口名
     **/
    private String serviceName;


    /**
     * 请求响应参数
     * 请求体
     **/
    private String requestBody;

    /**
     * 响应体
     **/
    private String responseBody;


    /**
     * 耗时统计(毫秒)
     * 请求时间
     **/
    private Long startTime;

    /**
     * 响应时间
     **/
    private Long endTime;

    /**
     * 耗时(响应-请求）
     **/
    private Long duration;
}
