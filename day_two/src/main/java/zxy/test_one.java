package zxy;

import java.util.Scanner;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-04-8:58
 * @Description: 购物满500打8折, 否则打9折
 */
public class test_one {

    public static void main(String[] args) {
        //满500打8折,否则打9折
        Scanner input = new Scanner(System.in);
        System.out.println("请输入购物金额：");
        double money = input.nextDouble();
        if (money >= 500) {
            System.out.println("您的消费金额为：" + money * 0.8);
        } else {
            System.out.println("您的消费金额为：" + money * 0.9);
        }
    }
}
