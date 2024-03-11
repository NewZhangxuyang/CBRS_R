import java.util.concurrent.*;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-11-8:38
 * @Description: java的线程池技术
 * <p>
 * <p>
 * execute()方法用于添加一个任务
 * 如果当前运行的线程少于corePoolSize，则创建新线程来执行任务（注意，执行这一步骤需要获取全局锁）
 * 如果运行的线程等于或多于corePoolSize，则将任务加入BlockingQueue。
 * 如果无法将任务加入BlockingQueue（队列已满），则是临时工作线程来执行任务
 * 如果创建新线程将使当前运行的线程超出maximumPoolSize，任务将被拒绝，并调用RejectedExecutionHandler.rejectedExecution()方法
 * <p>
 * <p>
 * <p>
 *
 *
 * submit()方法用于提交需要返回值的任务
 * 线程池会返回一个future类型的对象，通过这个future对象可以判断任务是否执行成功，并且可以通过future的get()方法来获取返回值
 * get()方法会阻塞当前线程直到任务完成
 * 而使用get（long timeout，TimeUnit unit）方法则会阻塞当前线程一段时间后立即返回，这时候有可能任务没有执行完
 */
public class test_one {



    public static void main(String[] args) {
        ExecutorService threadPoolExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new test_runnable());
        }
        ExecutorService threadPoolExecuto1r = Executors.newFixedThreadPool(Integer.MAX_VALUE);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);


        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        /**
         * 按周期的执行任务
         */
        executorService.scheduleAtFixedRate(new test_runnable(), 0, 1, TimeUnit.SECONDS);


    }

}
