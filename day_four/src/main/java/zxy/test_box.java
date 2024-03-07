package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-17:07
 * @Description:
 * java 的包装类，装箱和拆箱
 * 装箱：基本数据类型转换为包装类
 * 拆箱：包装类转换为基本数据类型
 *
 *
 *  对于基本数据类型，==（双等号）比较的是值，而对于包装类型，==（双等号）比较的则是2个对象的内存地址
 *  包装类会重写equals方法，用于比较两个包装类对象的值是否相等
 *  包装类.equals(对应基本数据类型)，会自动装箱，equals接受的是Object类型
 *
 */
public class test_box {
    public static void main(String[] args) {

        /**
         * 手动装箱
         * 可以看到从-128到到127之间的值都被缓存到cache里了，这个叫做包装类的缓存
         * Java对部分经常使用的数据采用缓存技术，在类第一次被加载时换创建缓存和数据
         * 当使用等值对象时直接从缓存中获取，从而提高了程序执行性能
         *
         * valueOf会优化-128到127之间的数值，如果在这个范围内，会直接从缓存中获取
         * 而超出这个范围的数值，会重新new一个对象
         *
         * 直接new Integer()的方式，不会使用缓存
         */
        Integer a = Integer.valueOf(100);


        /**
         * new Integer()是直接创建新的对象
         */
        Integer b = new Integer(100);


        /**
         * 自动装箱，是自动使用valueOf方法
         */
        Integer c = 100;
        System.out.println(a == b);
        System.out.println(a == c);


    }


    /**
     *
     * 静态代码块->main方法->代码块->构造方法
     */
}
