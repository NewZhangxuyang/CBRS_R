package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-10:35
 * @Description: 对异常的操作
 * java.lang.Throwable作为所有异常的超类。
 * <p>
 * 异常类分为两大类，错误Error和异常Exception
 * 一个分支是Error，它表示不希望被程序捕获或者是程序无法处理的错误
 * 另一个分支是Exception，它表示用户程序可能捕捉的异常情况或者说是程序可以处理的异常
 * 其中异常类Exception又分为运行时异常(RuntimeException)和非运行时异常( checked exception)
 */
public class test_exception {


    public static void main(String[] args) throws Exception {
        /**
         * 除了RuntimeException及其子类以外------>不受检查异常
         * RuntimeException（运行时异常）
         * 有ArrayIndexOutOfBoundsException（数组下标越界）、NullPointerException（空指针异常）
         * ArithmeticException（算术异常）、MissingResourceException（丢失资源）
         * ClassNotFoundException（找不到类）等异常
         *
         *
         *
         * 其他的Exception类及其子类都属于检查异常
         * 当程序中可能出现这类异常，要么使用try-catch语句进行捕获，要么用throws子句抛出，否则编译无法通过
         * 如IOException、SQLException等以及用户自定义的Exception异常
         *
         *
         *
         * 不受检查异常为编译器不要求强制处理的异常，检查异常则是编译器要求必须处置的异常
         */


    }


    public static void test()  throws Exception {
        /**
         * throws -- 用在方法签名中，用于声明该方法可能抛出的异常
         *
         *
         *
         * 如果是不受检查异常（unchecked exception），即Error、RuntimeException或它们的子类
         * 那么可以不使用throws关键字来声明要抛出的异常，编译仍能顺利通过，但在运行时也会被系统抛出。
         *
         *
         *
         * 必须声明方法可抛出的任何检查异常（checked exception）
         * 即如果一个方法可能出现受可查异常，要么用try-catch语句捕获，要么用throws子句声明将它抛出，否则会导致编译错误
         *
         *
         * 当抛出了异常，该方法的调用者才必须处理或者重新抛出该异常。当方法的调用者无力处理该异常的时候，应该继续抛出，而不是囫囵吞枣。
         *
         *
         */
        try {
            /**
             * try 是用来监控可能出现异常的代码，声明可能出现异常的代码
             */
            int a = 1 / 3;
        } catch (Exception e) {
            /**
             * catch 是用来捕获异常的，当try中的代码出现异常时，会被catch捕获
             * 若有一个catch语句匹配到了，则执行该catch块中的异常处理代码，就不再尝试匹配别的catch块了
             */
            throw new RuntimeException(e);
        }
        /**
         * 可以加入message，输出异常信息
         */
        throw  new RuntimeException("自定义异常");
    }
}
