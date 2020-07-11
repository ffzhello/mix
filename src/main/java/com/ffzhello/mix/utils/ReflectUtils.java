package com.ffzhello.mix.utils;

/**
 * @author ffzhello
 * @since 2020/7/4
 **/
public class ReflectUtils {
    /**
     * 构建
     **/
    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot new instance. class: " + clazz.getSimpleName());
        }
    }

    public static void main(String[] args) {
        MethodUtils methodUtils = newInstance(MethodUtils.class);
        methodUtils.sayHello();
    }
}
