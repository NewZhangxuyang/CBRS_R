package zxy;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-11:05
 * @Description: 线程的操作
 */
public class test_thread implements Runnable {

    private int total;


    public test_thread(int total) {
        this.total = total;
    }

    public test_thread() {
    }

    @Override
    public void run() {
        total++;
        System.out.println("线程启动了" + total);
    }


}


class test_thread_main {
    public static void main(String[] args) {

        /**
         * 同一个Runnable对象可以被多个线程共享
         *
         * java只能单继承，因此如果是采用继承Thread的方法，那么在以后进行代码重构的时候可能会遇到问题，因为你无法继承别的类了
         *
         *其次，如果一个类继承Thread，则不适合资源共享。但是如果实现了Runnable接口的话，则很容易的实现资源共享
         * 非常适合资源共享
         */
        test_thread test_thread = new test_thread();
        int flag = 0;
        while (flag < 100000) {
            new Thread(test_thread).start();
            flag++;
        }
    }

}

class ticket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        /**
         * 买票的循环，进入这个线程后，就是持续卖票
         */
        while (true) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }


    }
}

class sell_ticket {
    public static void main(String[] args) {
        ticket ticket = new ticket();
        int flag = 0;
        while (flag < 4) {
            flag++;
            new Thread(ticket).start();
        }
    }
}

class test_synchronize {
    public static void main(String[] args) {

        synchronize_implement synchronize_implement = new synchronize_implement();
        int flag = 0;
        while (flag < 4) {
            flag++;
            new Thread(synchronize_implement).start();
        }

    }
}


class synchronize_implement implements Runnable {
    /**
     * 说明：
     * <p>
     * 操作共享数据（多个线程共同操作的变量）的代码，即为需要被同步的代码。
     * 不能多包涵代码（效率低，如果包到while前面就变成了单线程了），也不能少包含代码
     * 共享数据：多个线程共同操作的变量。
     * <p>
     * <p>
     * 同步监视器：俗称，锁。任何一个类的对象都可以充当锁。但是所有的线程都必须共用一把锁，共用一个对象。
     * <p>
     * <p>
     * 锁的选择：
     * 自行创建，共用对象，如下面使用的Object对象。
     * <p>
     * 使用this表示当前类的对象
     * <p>
     * 注意：继承Thread的方法中的锁不能使用this代替，因为继承thread实现多线程时
     * 会创建多个子类对象来代表多个线程，这个时候this指的时当前这个类的多个对象，不唯一，无法当作锁
     * 但是可以用synchronize_implement.class来当作锁
     * <p>
     * <p>
     * <p>
     * 实现Runnable接口的方式中，this可以当作锁
     * 因为这种方式只需要创建一个实现类的对象，将实现类的对象传递给多个Thread类对象来当作多个线程
     * this就是这个一个实现类的对象，是唯一的，被所有线程所共用的对象。
     * <p>
     * <p>
     * 使用类当作锁，以下面demo为例，其中的锁可以写为synchronize_implement.class, 从这里可以得出结论，类也是一个对象
     */
    private int shara_element = 100;
    Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (shara_element > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + shara_element + "张票");
                    shara_element--;
                }
            }
        }
    }
}

class synchronize_method implements Runnable {
    private int shara_element = 100;

    /**
     * 将所要同步的代码放到一个方法中，将方法声明为synchronized同步方法。之后可以在run()方法中调用同步方法。
     * <p>
     * 要点：
     * 同步方法仍然涉及到同步监视器，只是不需要我们显示的声明
     * <p>
     * 非静态的同步方法，同步监视器是：this   对象级别
     * <p>
     * 静态的同步方法，同步监视器是：当前类本身   类级别
     */


    @Override
    public void run() {
        sell_ticket();
    }

    public synchronized void sell_ticket() {
        while (true) {
            if (shara_element > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + shara_element + "张票");
                shara_element--;
            }
        }
    }
}

class lock_implement implements Runnable {

    /**
     * 通过实例化ReentrantLock对象
     * 在所需要同步的语句前，调用ReentrantLock对象的lock()方法，实现同步锁
     * 在同步语句结束时，调用unlock()方法结束同步锁
     * <p>
     * synchronized和lock的异同
     * <p>
     * Lock是显式锁（需要手动开启和关闭锁），synchronized是隐式锁，执行流出了作用域自动释放
     * Lock只有代码块锁，synchronized有代码块锁和方法锁
     * <p>
     * 使用Lock锁，JVM将花费较少的时间来调度线程，性能更好。并且具有更好的拓展性（提供更多的子类）
     * Lock—>同步代码块（已经进入了方法体，分配了相应的资源）—>同步方法（在方法体之外）
     */

    private int shara_element = 100;
    private   Lock  lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {

                /**
                 * 利用ReentrantLock对象的lock()方法，实现同步锁
                 */
                lock.lock();
                if (shara_element > 0) {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + shara_element + "张票");
                    shara_element--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                /**
                 * 无论程序是否出现异常，都会释放锁
                 * 锁必须释放
                 */
                lock.unlock();
            }
        }
    }
}