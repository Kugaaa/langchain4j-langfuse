/**
 * @(#)MethodInterceptor.java, 9月 12, 2024.
 * <p>
 * Copyright 2024 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.kuga;

import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.Callable;

/**
 * @author zhaokai
 */
public class MethodInterceptor {
    @RuntimeType
    public static Object intercept(@Origin Method method, @SuperCall Callable<?> callable, @AllArguments Object[] allArguments) throws Exception {
        // todo: 方法执行前后记录 trace 和 span
        long start = System.currentTimeMillis();
        Observe observe = method.getAnnotation(Observe.class);
        String name = observe.name();
        ObservationType type = observe.type();
        System.out.println("方法开始执行，方法名称 = " + method.getName() + " 方法参数 = " + Arrays.toString(allArguments) + "Observe.name = " + name + "Observe.type = " + type);

        try {
            // 原有函数执行
            Object res = callable.call();
            System.out.println("方法执行结束，方法名称 = " + method.getName() + "方法返回值 = " + res);
            return res;
        } finally {
            System.out.println("方法执行耗时 = " + (System.currentTimeMillis() - start) + "ms");
        }
    }
}