package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-16:46
 * @Description:
 */
public class test_five_implement implements test_five {
    @Override
    public void print() {

    }

    @Override
    public void printDefault() {
        test_five.super.printDefault();
    }

    public static void testImplementStatic() {
        test_five.printStatic();
    }
}
