package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-05-15:05
 * @Description:
 */
public class test_five extends test_three {


    String string = "son";

    public void stringP() {
        System.out.println(string);
        System.out.println(super.string);
    }


    public static void main(String[] args) {
        test_five test_five = new test_five();
        test_five.print();
        test_five.stringP();
    }
}
