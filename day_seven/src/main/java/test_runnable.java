import java.time.LocalTime;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-11-9:33
 * @Description:
 */
public class test_runnable  implements Runnable
{
    @Override
    public void run() {
        System.out.println("thread"+Thread.currentThread().getName()+ LocalTime.now());
    }


}
