package zxy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-10:10
 * @Description: 集合中的元素允许重复
 * <p>
 * 集合中的元素是有顺序的，各元素插入的顺序就是各元素的顺序
 * 有序的意思是，插入顺序就是元素的顺序
 * <p>
 * <p>
 * List 集合是有索引下标的，为每个元素维护了索引
 * 集合中的元素可以通过索引来访问或者设置
 */
public class test_list_linkedlist {
    /**
     * arraylist和inkedlist的区别
     * 1.底层数据结构不同--arraylist底层是数组，linkedlist底层是链表
     * 2.插入和删除操作的效率区别--arraylist插入和删除操作效率低，linkedlist插入和删除操作效率高
     * 3.查询操作的效率区别--arraylist查询效率高，linkedlist查询效率低
     *
     *
     * arraylist底层是数组，有1.5倍的自动扩容机制
     * linkedlist底层是链表
     *
     */

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }


        /**
         * next() - 返回迭代器的下一个元素
         * 并将迭代器的指针移到下一个位置
         *
         *
         * hasNext() - 用于判断集合中是否还有下一个元素可以访问。
         */
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /**
         * 如果是List集合，想要在迭代中操作元素可以使用List集合的特有迭代器ListIterator
         * 该迭代器支持在迭代过程中，添加元素和修改元素
         * 支持双向遍历，尤其是逆序遍历
         */
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
        //输出当前秒数
        System.out.println("------------------------->" + System.currentTimeMillis());

        list.stream().forEach(n -> System.out.println(n));


        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }


}
