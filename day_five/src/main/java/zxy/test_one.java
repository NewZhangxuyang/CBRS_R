package zxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-8:40
 * @Description: new String("a")创建了几个对象？
 * <p>
 * 1. new 必定会在堆上创建一个新的对象
 * 2. 也会在字符串常量池中创建一个新的对象
 */
public class test_one {


    /**
     * 容器主要包括 Collection 和 Map 两种
     * Collection 存储着对象的集合，而 Map 存储着键值对(两个对象)的映射表
     * Collection 向下是List 和 Set  ，Queue
     *
     * List接口：数据有序，可重复，可有null
     * ——>ArrayList、LinkedList、Vector
     *
     * Queue接口：数据有序，可重复，可有null
     * ——>LinkedList、PriorityQueue
     *
     *
     *
     * Set接口：数据存入与取出无序，不可重复，只能存一个null，原因是需要用hashCode()，equals()方法来判断是否重复
     * 或者用comparable或者comparator接口来判断是否重复，并进行排序
     * TreeSet是排序的，这个排序是指根据元素的自然顺序进行排序，或者根据创建 set 时提供的 Comparator 进行排序
     * 不是根据放入元素的先后顺序排序的
     *
     *
     *
     *
     * ——>HashSet、TreeSet
     * Map 是键值对的集合，Map 中的每个元素都包含一个键对象和一个值对象
     *
     * Map中的Key是无序的，不可重复的，只能存一个null
     * Map中的Value是无序的，可重复的，可以存多个null
     * ——>HashMap、TreeMap、HashTable、LinkedHashMap
     */


    /**
     * 数组数据量确定而且无法保存具有映射关系的数据
     * 集合类用于保存数量不确定的数据，以及保存具有映射关系的数据。
     * <p>
     * 数组元素既可以是基本类型的值，也可以是对象
     * 集合只能保存对象。
     * <p>
     * Java集合类主要由两个根接口Collection和Map派生出来的
     * Collection派生出了三个子接口：List、Set、Queue（Java5新增的队列）
     * 因此Java集合大致也可分成List、Set、Queue、Map四种接口体系
     * （注意：Map不是Collection的子接口）
     * <p>
     * 其中List代表了有序可重复集合，可直接根据元素的索引来访问
     * Set代表无序不可重复集合，只能根据元素本身来访问
     * Queue是队列集合
     * <p>
     * Map代表的是存储key-value对的集合，可根据元素的key来访问value
     */


    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Object[] o = collection.toArray();
        Random random = new Random();
        boolean flag = true;
        while (flag) {
            int i = random.nextInt(100);
            collection.add(String.valueOf(i));
            if (i == 99) {
                flag = false;
            }
        }
    }


}
