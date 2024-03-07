package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-14:11
 * @Description:
 */
public class test_eight implements test_six, test_seven {
    @Override
    public void test() {
        System.out.println("实现了test方法");
    }


    public void test2() {
        System.out.println("重写了继承来的重复的test2方法");
    }


    /**
     * 想要重写返回值不同，函数名相同，参数值相同的方法，会同时受限于重载，重写规则
     * <p>
     * 方法名相同，参数列表相同，不符合重载规则
     * <p>
     * 重写时，返回值必须是父类返回值的子类
     */
    public String test1() {
        return "实现了test1方法";
    }

    public void test1(int a) {
        System.out.println("重写了继承来的重复的test2方法");
    }


}


class Main {
    public static void main(String[] args) {
        test_eight test_eight = new test_eight();
        test_eight.test();
        test_eight.test2();
    }
}
