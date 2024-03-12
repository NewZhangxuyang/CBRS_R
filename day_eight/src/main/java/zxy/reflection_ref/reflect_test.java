package zxy.reflection_ref;

import zxy.test_annotation;
import zxy.test_domain_student;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-14:29
 * @Description:
 */
public class reflect_test {


    public static void main(String[] args) {

        /**
         * 获取字节码对象的三种方式
         */
        //1.通过对象获取
        Class clazzObj = new test_annotation().getClass();
        //2.通过类名获取
        Class clazzName = test_domain_student.class;
        //3.通过Class.forName获取
        try {
            Class  clazzForName =  Class.forName("zxy.test_annotation");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        reflection_reflect.intercept(clazzObj);





    }
}
