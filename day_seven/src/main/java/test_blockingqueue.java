import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-11-11:05
 * @Description: java 的阻塞队列
 */
public class test_blockingqueue {

    public static void main(String[] args) {


        /**
         * ArrayBlockingQueue
         * ArrayBlockingQueue是一个用数组实现的有界阻塞队列
         * 此队列按照先进先出的原则对元素进行排序
         */


        /**
         * LinkedBlockingQueue
         * LinkedBlockingQueue是一个用链表实现的有界阻塞队列
         * 此队列的默认和最大长度为Integer.MAX_VALUE
         * 此队列按照先进先出的原则对元素进行排序。
         *
         *
         *
         * PriorityBlockingQueue
         * PriorityBlockingQueue是一个支持优先级的无界阻塞队列
         * 默认情况下元素采取自然顺序升序排列。也可以自定义类实现compareTo()方法来指定元素排序规则
         * 或者初始化PriorityBlockingQueue时，指定构造参数Comparator来进行排序
         * 需要注意的是不能保证同优先级元素的顺序。
         *
         *
         *
         * DelayQueue
         * DelayQueue是一个支持延时获取元素的无界阻塞队列
         * 队列使用PriorityBlockingQueue来实现
         * 队列中的元素必须实现Delayed接口，在创建元素时可以指定多久才能从队列中获取当前元素
         * 只有在延迟期满时才能从队列中提取元素。
         *
         */


        /**
         * 队列的方法
         *
         * offer()：添加元素，如果队列已满直接返回 false，队列未满则直接插入并返回 true；
         * poll()：删除并返回队头元素，当队列为空返回 null；
         * add()：添加元素，此方法是对 offer 方法的简单封装，如果队列已满，抛出 IllegalStateException 异常
         * remove()：直接删除队头元素；
         * put()：添加元素，如果队列已经满，则会阻塞等待插入；
         * take()：删除并返回队头元素，当队列为空，则会阻塞等待
         * peek()：查询队头元素，但不会进行删除；
         * element()：对 peek 方法进行简单封装，如果队头元素存在则取出并不删除，如果不存在抛出 NoSuchElementException 异常。
         * 注意：一般情况下 offer() 和 poll() 方法配合使用
         * put() 和 take() 阻塞方法配合使用
         * add() 和 remove() 方法会配合使用
         *
         * 程序中常用的是 offer() 和 poll() 方法，因此这两个方法比较友好，不会报错
         */


        /**
         *
         */
        Callable<String> callable = new test_callable();
        FutureTask future = new FutureTask<String>(callable);
        Thread  thread =   new Thread(future);
        thread.start();

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("main"+LocalTime.now());

    }
}


class test_callable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        return "callable"+ LocalTime.now();
    }
}