package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-9:07
 * @Description: 对final 关键字的理解
 */
public class test_one {
    public static final int a;

    static {
        a = 1;
    }

    public final int b;

    {
        b = 2;
    }

    public final double d;

    public test_one() {
        d = 3.0;
    }


}
