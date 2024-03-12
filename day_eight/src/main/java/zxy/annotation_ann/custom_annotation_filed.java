package zxy.annotation_ann;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-10:44
 * @Description:
 * 自定义注解
 */


@Target({java.lang.annotation.ElementType.TYPE,
        java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD,
        java.lang.annotation.ElementType.PARAMETER,
        java.lang.annotation.ElementType.LOCAL_VARIABLE})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)


public @interface custom_annotation_filed {

     int id() default 0;

    String name() default "hello,注解已经注入";

    String[] value() default {};

}
