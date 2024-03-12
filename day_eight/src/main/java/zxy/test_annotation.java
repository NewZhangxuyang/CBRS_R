package zxy;

import zxy.annotation_ann.custom_annotation_filed;

import java.util.Arrays;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-10:32
 * @Description: java的注解, 分为三类：
 * 1.jdk注解  2.元注解   3.自定义注解
 * <p>
 * jdk注解 有5个，分别是：
 * @Override： 用于标识子类中的方法覆盖了父类中的方法
 * @Deprecated： 用于标识某个程序元素(类 、 方法等)已经过时
 * @SuppressWarnings： 用于抑制编译器产生警告
 * @SafeVarargs： 用于抑制参数安全警告
 * @FunctionalInterface： 用于标识一个接口是函数式接口
 * <p>
 * 元注解有4个，分别是：
 * @Target： 用于描述注解的使用范围
 * @Retention： 用于描述注解的生命周期，即被描述的注解在什么范围内有效
 * 分为三个范围：1.SOURCE 2.CLASS 3.RUNTIME
 * @Documented：用于描述其它类型的注解应该被作为被标注的程序成员的公共API
 * @Inherited：用于描述一个类是否是继承了父类所拥有的注解 注解存在的范围：
 * ElementType.TYPE:用于描述类、接口(包括注解类型) 或enum声明
 * ElementType.FIELD:用于描述实例变量
 * ElementType.METHOD:用于描述方法
 * ElementType.PARAMETER:用于描述参数
 * ElementType.CONSTRUCTOR:用于描述构造器
 * ElementType.LOCAL_VARIABLE:用于描述局部变量
 * ElementType.ANNOTATION_TYPE:用于描述另一个注解
 * ElementType.PACKAGE:用于描述包
 */
public class test_annotation {

    /**
     * 不添加属性名时，默认给的是value的值
     */
    @custom_annotation_filed({"zhang", "xu", "yang"})
    private String name;


    @custom_annotation_filed(id = 1000)
    private int age;


    private test_annotation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public test_annotation() {
    }


    private void test(int age, String name) {
        System.out.println("test");
    }


    private static Object test_private(String...  i) {
        /**
         * String...   类似于数组，表示不定参数，也就是调用这个方法的时候这里可以传入多个String对象
         */
        return i;
    }


    @Override
    public String toString() {
        return "test_annotation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
