package zxy;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-11:17
 * @Description:  List下的队列分支
 */
public class test_list_queue {


    public static void main(String[] args) {
        /**
         * Queue是一个接口，它继承了Collection接口
         * 常用的实现类有：ArrayDeque、LinkedList、PriorityQueue
         *
         * Deque 是一种双端队列
         *
         * 当需要使用队列时也就首选ArrayDeque了
         * 次选是LinkedList
         */


        /**
         * 最好用ArrayDeque引用，不然子类的方法用不了
         */
        ArrayDeque queue =  new ArrayDeque() ;
        Queue linkQueue = new LinkedList();

    }

}
