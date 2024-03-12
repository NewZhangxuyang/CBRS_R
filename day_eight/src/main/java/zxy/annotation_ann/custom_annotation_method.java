package zxy.annotation_ann;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-11:06
 * @Description: 方法注解
 */

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(java.lang.annotation.ElementType.METHOD)
public @interface custom_annotation_method {

    /**
     * 注解的本质是接口
     * 接口中可以定义常量 和 方法
     * 在注解中定义接口方法,就是注解的属性;
     * 为注解添加属性:接口中的方法都是抽象方法,其中 public abstract 可以省略
     */
    public static final int i = 0;


    /**
     * 集合的默认值是 {}，代表空数组
     *
     * @return
     */
    String[] values() default {};


    double list() default 0.0;

    /**
     * 特殊属性
     * 注解的特殊属性名称：value
     * 如果只有一个 value 属性的情况下，使用 value 属性的时候可以,省略value名称不写
     * 如果有多个属性，且多个属性没有默认值，那么value是不能省略的
     */
    String value() default "hello,注解已经注入";

}
