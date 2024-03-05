package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-04-16:31
 * @Description: 函数声明调用
 */
public class test_eight {


    public static void main(String[] args) {
        attack();
        attack1("1");
        System.out.println(attack2("2"));
    }

    public static void attack() {
        System.out.println("attack");
    }

    public static void attack1(String s) {
        System.out.println("attack" + s);
    }

    public static String attack2(String s) {
        return "attack" + s;
    }

}
