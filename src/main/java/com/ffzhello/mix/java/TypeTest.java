package com.ffzhello.mix.java;

import java.lang.reflect.*;
import java.util.List;

/**
 * 在范型出现之前，java用Class对象表达对象的类型信息
 * 在范型出现之后，Class对象不能表示范型对象的类型信息，所以引用Type来表达范型的类型信息
 *
 * @author ffzhello
 * @date 2020/9/20
 **/
class A {

}

public class TypeTest<T> {

    /**
     * forTest
     **/
    public void forTest(String param0,
                        T param1,
                        List<String> param2,
                        List<T> param3,
                        List<? extends A> param4,
                        String[] param5,
                        T[] param6,
                        List<String>[] param7,
                        List<T>[] param8,
                        List<? extends A> param9) {

        // for test
    }

    public static void main(String[] args) throws Exception {
        Method forTest = TypeTest.class.getMethod("forTest", String.class, Object.class, List.class, List.class, List.class, String[].class, Object[].class, List[].class, List[].class, List.class);
        Type[] types = forTest.getGenericParameterTypes();

        // 原始类型Class
        System.out.println(types[0] instanceof Class);
        System.out.println(types[0].equals(String.class));

        // 类型变量TypeVariable
        System.out.println(types[1] instanceof TypeVariable);
        TypeVariable typeVariable = (TypeVariable) types[1];
        System.out.println(typeVariable.getBounds()[0].getTypeName());

        // 参数化类型ParameterizedType, 实际类型为Class
        System.out.println(types[2] instanceof ParameterizedType);
        ParameterizedType parameterizedType = (ParameterizedType) types[2];
        System.out.println(parameterizedType.getRawType().equals(List.class));
        // 实际参数类型
        Type actualTypeArgument = parameterizedType.getActualTypeArguments()[0];
        System.out.println(actualTypeArgument.equals(String.class));

        // 参数化类型ParameterizedType, 实际类型为TypeVariable
        ParameterizedType parameterizedTypeVariable = (ParameterizedType) types[3];
        Type actualTypeArgumentVariable = parameterizedTypeVariable.getActualTypeArguments()[0];
        System.out.println(actualTypeArgumentVariable instanceof TypeVariable);

        // 数组类型
        Class arrayClazz = (Class) types[5];
        System.out.println(arrayClazz.isArray());
        System.out.println(arrayClazz.isAssignableFrom(String[].class));

        // 范型数组
        System.out.println(types[6] instanceof GenericArrayType);
        GenericArrayType genericArrayType = (GenericArrayType) types[6];
        System.out.println(genericArrayType.getTypeName());
        Type genericComponentType = genericArrayType.getGenericComponentType();
        System.out.println(genericComponentType instanceof TypeVariable);

        System.out.println(types[7] instanceof GenericArrayType);
        GenericArrayType genericArrayTypeArr = (GenericArrayType) types[7];
        System.out.println(genericArrayTypeArr.getTypeName());
        Type genericComponentType1 = genericArrayTypeArr.getGenericComponentType();
        System.out.println(genericComponentType1 instanceof ParameterizedType);
    }
}
