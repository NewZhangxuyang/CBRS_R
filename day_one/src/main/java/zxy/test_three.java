package zxy;

import java.util.Scanner;

//计算圆的面积,接收键盘输入
public class test_three {

    public static void main(String[] args) {
        //键盘输入半径
        Scanner input = new Scanner(System.in);
//        System.out.println("请输入圆的半径：");
//        double r = input.nextDouble();
//        double area = Math.PI * r * r;
//        System.out.println("圆的面积为：" + area);

        //三目运算符，做比较选择
        System.out.println("请输入三个数：");
        int a = input.nextInt();
        int b = input.nextInt();
//      System.out.println("max = " + (a > b ? a : b));
        //三个数的最大值,只需要大的数浮出来
        int c = input.nextInt();
        System.out.println("max = " + (a > b ? (a > c ? a : c) : (b > c ? b : c)));
    }
}
