package com.ffzhello.mix.statistics;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author ffzhello
 * @description 请求统计
 * @since 2020/6/13
 **/
@Component
@Aspect
public class RequestStatisticsAop {

    /**
     * 请求统计切面
     **/
    @Around("@within(org.springframework.web.bind.annotation.RestController)")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 统计处理

        // 请求
        return joinPoint.proceed();

        // 异步写日志
        // TODO 策略模式之策略注入方式
    }
}
