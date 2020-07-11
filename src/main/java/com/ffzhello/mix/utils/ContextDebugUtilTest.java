package com.ffzhello.mix.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ffzhello
 * @since 2020/7/4
 **/
public class ContextDebugUtilTest {
    // 线程池
    public static void main(String[] args) throws InterruptedException {
        ContextDebugUtil.addLog("main");
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 打印一次
        ContextDebugUtil.print();

        int i = 10;
        for (int j = 1; j <= i; j++) {
            int finalJ = j;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    ContextDebugUtil.addLog(String.format("%dth log.", finalJ));
                }
            });
        }

        ContextDebugUtil.print();
        ContextDebugUtil.remove();
    }
}
