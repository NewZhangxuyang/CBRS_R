package zxy;

import java.util.*;
import java.util.Map.*;
/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-11:27
 * @Description: Set集合的操作
 *
 * Set扩展Collection接口,无序集合，不允许存放重复的元素
 * 所谓无序即是存入和取出的顺序不一定相同，值不能重复
 *
 *
 *
 * Set接口常用的实现类有：HashSet、LinkedHashSet、TreeSet
 *
 *
 *
 *
 *
 */
public class test_set {


    /**
     * hashcode()与equals()方法的调用机制
     * hashCode方法可以这样理解：
     * 它返回的就是根据对象的内存地址换算出的一个值
     * 这样一来，当集合要添加新的元素时，先调用这个元素的hashCode方法，就一下子能定位到它应该放置的物理位置上
     * 如果这个位置上没有元素，它就可以直接存储在这个位置上，不用再进行任何比较了
     * 如果这个位置上已经有元素了，出现相同的哈希值，那就调用它的equals方法与新元素进行比较
     * 相同的话就不存了，不相同就散列其它的地址
     *
     *——————————————————————————————————————————
     * 如果两个对象相等，则hashcode一定也是相同的
     * 两个对象有相同的hashcode值，它们并不一定是相等的
     *
     *
     * 首先会根据hashcode值定位，然后再根据equals方法进行比较
     *
     *
     *
     * HashSet存储的对象都被作为HashMap的key值保存到了HashMap
     *
     * HashMap存储的是键值对，封装成Entry对象
     *
     * 结构是：数组+链表/红黑树
     *也俗称为数组和bucket
     *
     *
     * Entry，每个 Entry 其实就是一个 key-value 对。
     * 当系统决定存储 HashMap 中的 key-value 对时，完全没有考虑 Entry 中的 value
     * 仅仅只是根据 key 来计算并决定每个 Entry 的存储位置
     * 可以把 Map 集合中的 value 当成 key 的附属
     *
     *
     *
     *
     */
    public static void main(String[] args) {

        /**
         * 若存对象，必须重写hashCode和equals方法
         */

        HashSet<String> hashSet = new HashSet(100,0.8f);
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        /**
         * Set 是没有get方法的，因为Set是无序的，所以没有索引
         * 遍历Set集合，用迭代器
         * foreach本质上是迭代器
         */
        for (String s : hashSet) {
            System.out.println(s);
        }
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        hashSet.stream().forEach(s -> {
            String upperS = s.toUpperCase();
            System.out.println(upperS);
        });


        /**
         * TreeSet,排序集合，注意是可实现排序的集合，不允许存放重复的元素
         *
         *
         * TreeSet是SortedSet接口实现类，TreeSet是一种排序集合，该对象中只能添加一种类型元素
         * 否则，会抛出java.lang.ClassCastException异常
         * TreeSet与HashSet集合采用hash算法来决定元素的存储位置有些不一样，TreeSet是采用红黑树这种数据结构存储集合元素
         *
         *
         *
         *
         * TreeSet的compareTo()方法详解
         * TreeSet支持两种排序方式：自然排序和自定义排序（定制排序）。
         *
         * 自然排序
         *
         * 介绍：根据元素自带的比较规则进行排序
         *
         * TreeSet是通过Comparable接口的compareTo(Object obj)方法比较元素之间的大小关系
         * 然后将元素按照升序排列，即为自然排序。
         *
         * 实现原理：
         * 元素对象实现Comparable接口，并实现compareTo(Object obj)方法，返回一个整数值
         * 当一个对象调用该方法与另一个对象进行比较时，如obj1.compareTo(obj2)，该方法若返回0，则表明obj1和obj2这两个对象相等
         * 若返回一个正整数，则表明obj1大于obj2
         * 若返回一个负整数，则表明obj1小于obj2
         * 然后根据红黑树结构寻找存储位置，当元素相同，若此时使用集合add()方法时，无法将新对象添加到集合内
         * TreeSet通过元素对应的类重写的compareTo(Object obj)方法来比较对象大小
         *
         *
         *
         * 自定义排序
         * 实现原理：
         * 创建TreeSet集合对象时，提供一个Comparator对象与该集合进行关联，在Comparator对象中实现集合元素的排序逻辑
         *
         * 传入Comparator对象的方式：
         * 用匿名内部类的形式实现Comparator接口,重写compare方法
         * 用lambda表达式实现Comparator接口
         *
         *
         */
        TreeSet<String> treeSet = new TreeSet<>();

        /**
         * 匿名内部类
         * TreeSet  treeSetCompare = new TreeSet( new Comparator(){
         *     @Override
         *     public int compare(Object o1, Object o2) {
         *     return 0;
         *     }
         * }  );
         *
         *  Lambda表达式
         * TreeSet  treeSetLam = new TreeSet( (o1, o2) -> {
         *     return 0;
         * });
         */


        /**
         * addAll()方法,是Collection接口的方法，可以将一个集合中的所有元素添加到另一个集合中
         * 可以不区分哪种集合，只要是集合就可以
         */
        treeSet.addAll(hashSet);


        for (String s : treeSet) {
            System.out.println(s);
        }

        Iterator<String> iterator1 = treeSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next()+"next");
        }


        /**
         * LinkedHashSet
         * LinkedHashSet是HashSet的子类，它使用链表维护元素的插入顺序
         * 也就是说，当我们遍历LinkedHashSet时，LinkedHashSet将会以元素的添加顺序访问集合中的元素
         */



    }
}
