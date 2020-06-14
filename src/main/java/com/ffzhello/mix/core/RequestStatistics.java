package com.ffzhello.mix.core;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
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
public class RequestStatistics {

    /**
     * 次数统计
     **/
    @Around("@within(org.springframework.web.bind.annotation.RestController)")
    public String doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 方法名
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        long startTime = System.currentTimeMillis();

        // 请求
        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        System.out.println("hello");
        return JSON.toJSONString(result);
    }
}
