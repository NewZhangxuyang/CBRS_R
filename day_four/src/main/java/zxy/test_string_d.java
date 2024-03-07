package zxy;

import java.sql.SQLOutput;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-15:48
 * @Description:
 *
 *
 * 我们常说的String不能被修改是指String类里面的value数组不能更改
 * 而不能更改的原因并不是因为final,而是因为private,这是一个私有变量
 * final只是保证了value数组的引用不会改变，但是并不保证value数组里面的内容不会改变
 * 要想更改必须通过调用set方法，但是原生String类中并没有提供set方法，所以没有办法更改
 */
public class test_string_d {


    public static void main(String[] args) {
        char [] value = {'a','b','c'};
        String charStr = new String(value);


        byte [] coder = {97,98,99};
        String byteStr = new String(coder);

        /**
         * 显式使用双引号构造字符串对象、使用String对象的intern()方法,都会在常量池中创建一个字符串对象
         * 这两个方法不一定会在常量池中创建对象，如果常量池中已存在相同的对象，则会直接返回该对象的引用，重复利用String对象
         * 其他创建String对象的方法都是在堆区中创建String对象
         */
        String str ="abc";


        /**
         * 采用new关键字新建一个字符串对象时，JVM首先在字符串池中查找有没有"aaa"这个字符串对象
         * 如果有，则不在池中再去创建"aaa"这个对象了，直接在堆中创建一个"aaa"字符串对象，然后将堆中的这个"aaa"对象的地址返回赋给引用str3
         * 这样，str3就指向了堆中创建的这个"aaa"字符串对象
         * 如果没有，则首先在字符串池中创建一个"aaa"字符串对象，然后再在堆中创建一个"aaa"字符串对象
         * 然后将堆中这个"aaa"字符串对象的地址返回赋给str3引用，这样，str3指向了堆中创建的这个"aaa"字符串对象
         * 当执行String str4=new String("aaa")时
         *
         * 因为采用new关键字创建对象时，每次new出来的都是一个新的对象
         *
         * 只不过会先在常量池中进行一系列操作，但带new的，终归会在堆中创建一个新的对象
         */
        String str1 = new String("abc");

        String string = "  abccbbbq  ";
        System.out.println(string);
        System.out.println(str.endsWith("c"));
        System.out.println(str.toUpperCase());
        System.out.println(string.indexOf("b",3));
        System.out.println(string.substring(1,3));
        //只是去掉首尾空格
        System.out.println(string.trim());
        //以指定的字符分割字符串,返回一个数组,最多分割成几个
        System.out.println(string.split("",2));
    }




}
