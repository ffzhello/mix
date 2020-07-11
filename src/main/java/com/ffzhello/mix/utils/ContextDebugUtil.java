package com.ffzhello.mix.utils;

import org.apache.logging.log4j.util.Strings;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ffzhello
 * @since 2020/7/4
 **/
public class ContextDebugUtil {
    private static final ThreadLocal<List<String>> LOGLIST = new InheritableThreadLocal<List<String>>() {
        @Override
        protected List<String> initialValue() {
            return new ArrayList<>();
        }
    };

    public static void addLog(String log) {
        if (Strings.isNotBlank(log)) {
            LOGLIST.get().add(log);
        }
    }

    public static void remove() {
        LOGLIST.remove();
    }

    public static void print() {
        List<String> logList = LOGLIST.get();
        if (CollectionUtils.isEmpty(logList)) {
            return;
        }

        logList.forEach(System.out::println);
    }
}
