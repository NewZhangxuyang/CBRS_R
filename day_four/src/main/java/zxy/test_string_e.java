package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-16:46
 * @Description: StringBuffer和StringBuilder 的区别
 * StringBuffer是线程安全的，StringBuilder是线程不安全的
 * StringBuffer是同步的，StringBuilder是非同步的
 * 二者的运行速度差不多，StringBuilder的速度更快
 * <p>
 * StringBuilder and  StringBuffer ，初始容量都是16，当超过16时，会自动扩容
 * 扩容的方式，原来的容量*2 + 2
 *
 *
 *
 * <p>
 * 拼接方法是append
 * <p>
 * 创建的是可变的字符序列，StringBuilder 和 StringBuffer 都支持可变字符串，允许对字符串进行动态修改
 */
public class test_string_e {

    public static void main(String[] args) {
        /**
         * 这种创建方式，带着初始字符串new创建，默认容量大小为 16 + 6
         *  始时的默认16加上所创建字符串的大小
         */
        StringBuilder stb = new StringBuilder("123456");

        /**
         * 这种是默认创建，容量大小为16
         */
        StringBuilder stringBuilder = new StringBuilder();
        // System.out.println(stb.capacity());
        System.out.println(stringBuilder.capacity());

        /**
         * 扩容出现，原来的容量*2 + 2
         */
        stringBuilder.append("123456");
        stringBuilder.append("一点浩然气，千里快哉风");
        /**
         * capacity()方法返回的是当前容量大小
         * length()方法返回的是当前字符串的长度
         */
        System.out.println(stringBuilder.capacity());

        /**
         * StringBuffer的创建方式和StringBuilder一样,默认容量大小为16
         * 但是StringBuffer是线程安全的，StringBuilder是线程不安全的
         * StringBuffer是同步的，有synchronized修饰
         */
        StringBuffer stringBuffer = new StringBuffer();;
        System.out.println(stringBuffer.capacity());
    }

}
