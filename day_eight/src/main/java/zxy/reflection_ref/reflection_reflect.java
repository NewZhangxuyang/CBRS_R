package zxy.reflection_ref;

import zxy.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-14:12
 * @Description: 关于反射的一些方法
 */
public class reflection_reflect {
    public static void intercept(Class clazz) {
        /**
         * 获取的是类的名，全限定名
         */
        System.out.println(clazz.getName());
        /**
         * 这个是Class对象所属的类
         */
        String className = clazz.getClass().getName();
        System.out.println(className);

        /**
         * 获取的是类的名，不包含包名
         */
        System.out.println(clazz.getSimpleName());
        /**
         * 获取的是类的包名
         */
        System.out.println(clazz.getPackage());
        /**
         * 获取的是类的直接父类
         */
        System.out.println(clazz.getSuperclass());
        /**
         * 获取的是类的直接接口
         */
        System.out.println(clazz.getInterfaces());
        /**
         * 获取的是类的修饰符
         */
        System.out.println(clazz.getModifiers());
        /**
         * 获取的是类的字段，但是不包括私有的
         */
        System.out.println(Arrays.toString(clazz.getFields()));
        Field field = null;
        try {
            field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            /**
             * 在调用 Field 类的 get() 方法时，因为静态变量是属于类而不是对象，所以第一个参数应该传递 null
             */
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }






        /**
         * 获取的是类的所有字段，包括私有的
         */
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
        /**
         * 获取的是类的方法，但是不包括私有的，但是包括继承的
         * 因为这个方法是获取的是public的方法
         */
        System.out.println(Arrays.toString(clazz.getMethods()));
        /**
         * 获取的是类的所有方法，包括私有的,但是不包括继承的
         */
        System.out.println(Arrays.toString(clazz.getDeclaredMethods()));

        Method privatMethod = null;
        try {
            privatMethod = clazz.getDeclaredMethod("test_private", String[].class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        privatMethod.setAccessible(true);
        /**
         * invoke方法是执行方法，第一个参数是对象，第二个参数是方法的参数
         * 如果是静态方法，第一个参数可以是null
         * 如果是私有方法，需要设置setAccessible为true
         */
        String[] arr = {"a", "b", "c"};
        /**
         * [ L java.lang.String
         * [代表是存储量
         * L代表是对象
         * java.lang.String代表是对象的类型
         *
         * 数组也是一种存储容器对象
         * java的数组本质是一个类，该类还保存了数据类型的信息
         */
        System.out.println("数组的类型" + (String[].class).getName());
        System.out.println("char的类型" + (char[].class).getName());
        System.out.println("Object的类型" + (Object[].class).getName());
        try {
            String[] s = (String[]) privatMethod.invoke(null, (Object) arr);
            System.out.println(Arrays.toString(s));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }


        /**
         * 获取的是类的构造方法，但是不包括私有的
         */
        System.out.println(Arrays.toString(clazz.getConstructors()));

        /**
         * 获取的是类的所有构造方法，包括私有的
         */
        System.out.println(Arrays.toString(clazz.getDeclaredConstructors()));


        /**
         * 一般获取类的私有构造方法
         */
        Constructor constructorPa = null;
        try {
            constructorPa = clazz.getDeclaredConstructor(String.class, int.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        System.out.println(constructorPa.getName());
        System.out.println(constructorPa.toString());
        test_annotation annotation;
        try {
            constructorPa.setAccessible(true);
            annotation = (test_annotation) constructorPa.newInstance("zhang", 18);
            System.out.println(annotation.toString());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        /**
         * 获取的是类的注解，包括继承的，present on this element
         */
        System.out.println(clazz.getAnnotations());

        /**
         * 获取的是类的注解，不包括继承的，present directly on this element
         */
        System.out.println(clazz.getDeclaredAnnotations());

        /**
         * 获取的是类的指定注解
         */
        System.out.println(clazz.getAnnotation(test_annotation.class));

        /**
         * 是否是匿名类
         */
        System.out.println(clazz.isAnonymousClass());

        /**
         * 是否是数组
         */
        System.out.println(clazz.isArray());


    }
}
