package org.example;

import org.junit.Test;
import zxy.reflection_ref.reflection_reflect;
import zxy.test_annotation;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-14:43
 * @Description: 测试用例
 */

public class Test_reflect {

    @Test
    public void test_reflect() {
        String [] arr= { "a", "b", "c" };
        Arrays.asList(arr).forEach(System.out::println);
    }


    @Test
    public  void  test_reflect_true(){
        reflection_reflect.intercept(test_annotation.class);
    }


}
