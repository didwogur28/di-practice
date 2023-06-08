package org.example.di;

import org.example.annotation.Inject;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.util.Set;

public class BeanFactoryUtils {

    public static Constructor<?> getInjectedConstructor(Class<?> clazz) {

        Set<Constructor> injectedConstrutors = ReflectionUtils.getAllConstructors(clazz, ReflectionUtils.withAnnotation(Inject.class));

        if(injectedConstrutors.isEmpty()) {
            return null;
        }

        return injectedConstrutors.iterator().next();
    }
}
