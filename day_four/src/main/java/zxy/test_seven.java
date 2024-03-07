package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-14:10
 * @Description:
 */
public interface test_seven {

    void test();



    void test1 (int a );

    default void test2() {
        System.out.println("7的默认方法");
    }
}
