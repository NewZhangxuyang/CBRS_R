package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-17:13
 * @Description: Java 的异常机制
 *
 *Error 类及其子类：程序中无法处理的错误，表示运行应用程序中出现了严重的错误
 *
 *Exception  程序本身可以捕获并且可以处理的异常，这种异常又分为两类：运行时异常和编译时异常
 * 运行时异常，是指程序在运行时才会出现的异常，这种异常是不可控的，是由程序员的逻辑错误引起的，比如空指针异常、数组下标越界异常等
 * 编译时异常，是指程序在编译时就会出现的异常，这种异常是可控的，是由程序员的错误引起的，比如文件找不到异常、文件无法读写异常等
 *
 *
 *
 *可查的异常（checked exceptions）和不可查的异常（unchecked exceptions）
 * 可查异常是必须进行处理的异常
 * 不可查异常是编译器不强制我们进行处理的异常
 */
public class test_exception {

    public static void main(String[] args) {
        /**
         *
         * try –  用于监听,将要被监听的代码(可能抛出异常的代码)放在try语句块之内，当try语句块内发生异常时，异常就被抛出
         * catch – 用于捕获异常,catch用来捕获try语句块中发生的异常
         * finally – finally语句块总是会被执行,
         * 它主要用于回收在try块里打开的物力资源(如数据库连接、网络连接和磁盘文件)
         * 只有finally块，执行完成之后，才会回来执行try或者catch块中的return或者throw语句
         * 如果finally中使用了return或者throw等终止方法的语句，则就不会跳回执行，直接停止。
         *
         */


        /**
         *  throw – 用于抛出异常
         *  throws – 用在方法签名中，用于声明该方法可能抛出的异常
         */
    }
}
