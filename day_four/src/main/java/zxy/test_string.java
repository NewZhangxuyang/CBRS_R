package zxy;

import java.util.Arrays;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-14:54
 * @Description:  正则表达式
 */
public class test_string {


    public static void main(String[] args) {
        String str1 = "hello.bai.xian";
        String str2 = "hello.bai*xian";
        String str3 =  "hello.bai.xian\\.";


        //将其写成符合正则表达式语法的字符串，写的是字符串，但是要编译成为正则表达式
        //将字符串编译成正则表达式


        //正则表达式，有时本身带有\,而java中自己又有转义，所以需要\\.,代表\.
        String[] ret1 = str1.split(".");
        String[] ret2 = str1.split("\\.", 2);
        System.out.println(Arrays.toString(ret1));
        System.out.println(Arrays.toString(ret2));
        System.out.println(str3);

    }

}
