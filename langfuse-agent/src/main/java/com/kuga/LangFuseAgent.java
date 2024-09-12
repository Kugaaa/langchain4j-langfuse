package com.kuga;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.JavaModule;

import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

import static net.bytebuddy.matcher.ElementMatchers.any;

public class LangFuseAgent {
    public static void premain(String arguments, Instrumentation instrumentation) {
        new AgentBuilder.Default()
                // todo: 如何缩小范围？
                .type(any())
                .transform((new Transformer()))
                .installOn(instrumentation);
    }

    private static class Transformer implements AgentBuilder.Transformer {
        @Override
        public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, ProtectionDomain protectionDomain) {
            if (hasMethodWithTargetAnnotation(typeDescription)) {
                return builder.method(ElementMatchers.isAnnotatedWith(Observe.class))
                        .intercept(MethodDelegation.to(MethodInterceptor.class));
            }

            return builder;
        }

        private boolean hasMethodWithTargetAnnotation(TypeDescription typeDescription) {
            return typeDescription.getDeclaredMethods().stream()
                    .anyMatch(methodDescription -> methodDescription.getDeclaredAnnotations().isAnnotationPresent(Observe.class));
        }
    }

}
