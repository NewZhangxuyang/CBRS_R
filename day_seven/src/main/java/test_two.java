import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-11-10:59
 * @Description: int corePoolSize：该线程池中核心线程数最大值
 * <p>
 * 核心线程：线程池中有两类线程，核心线程和非核心线程
 * 核心线程默认情况下会一直存在于线程池中，即使这个核心线程什么都不干（铁饭碗），而非核心线程如果长时间的闲置，就会被销毁（临时工）。
 * <p>
 * int maximumPoolSize：该线程池中线程总数最大值 。
 * 该值等于核心线程数量 + 非核心线程数量。
 * <p>
 * long keepAliveTime：非核心线程闲置超时时长。
 * 非核心线程如果处于闲置状态超过该值，就会被销毁。如果设置allowCoreThreadTimeOut(true)，则会也作用于核心线程。
 * <p>
 * TimeUnit unit：keepAliveTime的单位。
 * TimeUnit是一个枚举类型 ，包括以下属性：
 * NANOSECONDS   1微毫秒 = 1微秒 / 100
 * MICROSECONDS  1微秒 = 1毫秒 / 1000
 * MILLISECONDS  1毫秒 = 1秒 /1000 SECONDS 秒
 * MINUTES 分
 * HOURS 小时
 * DAYS 天
 */
public class test_two {

    public static void main(String[] args) {
        /**
         * 线程总数量 < corePoolSize，无论线程是否空闲，都会新建一个核心线程执行任务
         *
         * 线程总数量 >= corePoolSize时，新来的线程任务会进入任务队列中等待，
         * 然后空闲的核心线程会依次去缓存队列中取任务来执行（体现了线程复用）。
         *
         *
         * 当缓存队列满了，说明这个时候任务已经多到爆棚，需要一些“临时工”来执行这些任务了
         * 于是会创建非核心线程去执行这个任务
         *
         * 缓存队列满了，且总线程数达到了maximumPoolSize，则会采取上面提到的拒绝策略进行处理。
         */

        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);
        DelayQueue delayQueue = new DelayQueue();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();





        /**
         * Queue只是一个接口，当需要使用队列时也就首选ArrayDeque了(次选是LinkedList)
         * Deque是"double ended queue", 表示双向的队列，英文读作"deck".
         * Deque 继承自 Queue接口，除了支持Queue的方法之外，由于Deque是双向的，所以可以对队列的头和尾都进行操作
         */
        ArrayDeque deque = new ArrayDeque();
        Queue   queue = new LinkedList();
    }


}
