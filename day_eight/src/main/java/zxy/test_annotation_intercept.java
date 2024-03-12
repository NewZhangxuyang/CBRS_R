package zxy;

import zxy.annotation_ann.custom_annotation_filed;

import java.lang.reflect.Field;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-11:02
 * @Description:
 */
public class test_annotation_intercept {

public static void  intercept() {
    Field [] fields = test_domain_student.class.getDeclaredFields();

    for (Field field : fields) {
        if (field.isAnnotationPresent(custom_annotation_filed.class)) {
            custom_annotation_filed annotation = field.getAnnotation(
                    custom_annotation_filed.class);
            System.out.println("id:"+annotation.id());
            System.out.println("name:"+annotation.name());
        }
    }


    System.out.println("intercept");
}

}
