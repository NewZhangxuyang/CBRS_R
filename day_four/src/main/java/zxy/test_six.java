package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-14:09
 * @Description:
 */
public interface test_six {


    void test();


    String test1 ();

    default void test2(){
        System.out.println("6的默认方法");
    }
}
