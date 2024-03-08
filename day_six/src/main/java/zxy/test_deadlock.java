package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-16:32
 * @Description:
 *
 * 死锁是指两个或两个以上的进程在执行过程中，因争夺资源而造成的一种互相等待的现象
 *
 * 描述：
 *不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了死锁
 * 出现死锁后，并不会出现异常，不会出现提示，只是所有的线程都处于阻塞状态，无法继续
 *
 */
public class test_deadlock  {

    public static void main(String[] args) {
      int i=1>2?1:2;





    }
}
