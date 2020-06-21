package com.ffzhello.mix.statistics;

import lombok.Data;

/**
 * @author ffzhello
 * @since 2020/6/21
 **/
@Data
public class RequestStatisticsWriter implements Runnable {

    /**
     * 待写入库的统计信息
     **/
    private RequestStatisticsBO requestStatisticsBO;

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
       // TODO 将统计信息入库
    }
}
