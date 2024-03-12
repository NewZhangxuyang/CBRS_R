package zxy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-9:52
 * @Description: ArrayList实现了List接口，是顺序容器，即元素存放的数据与放进去的顺序相同，允许放入null元素
 * 底层通过数组实现
 * 除该类未实现同步外，其余跟Vector大致相同
 * 每个ArrayList都有一个容量(capacity)，表示底层数组的实际大小，容器内存储元素的个数不能多于当前容量
 * 当向容器中添加元素时，如果容量不足，容器会自动增大底层数组的大小
 * 前面已经提过，Java泛型只是编译器提供的语法糖，所以这里的数组是一个Object数组，以便能够容纳任何类型的对象
 * arraylist的默认容量是10
 * <p>
 * <p>
 * <p>
 * <p>
 * 数组进行扩容时，会将老数组中的元素重新拷贝一份到新的数组中
 * 每次数组容量的增长大约是其原容量的1.5倍
 * 也可以通过ensureCapacity()方法手动设置容量
 */
public class test_list_arraylist {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        System.out.println(list1);


        /**
         * ConcurrentModificationException: 当一个集合在循环中即使用引用变量操作集合又使用迭代器操作集合对象， 会抛出该异常
         */
        List<String> list = new ArrayList<>(30);
        System.out.println(list.size());
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(String.valueOf(i));
        }

        /**
         * arraylist底层是数组
         * 是通过数组实现的，所以可以通过下标来访问
         */
        list.set(1, "a");
        Iterator<String> iterator = list.iterator();
        /**
         *Iterator<String> iterator = list.iterator();
         * 一旦生成迭代器，就不能再使用集合的方法对集合进行操作，否则会抛出ConcurrentModificationException异常
         */
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
