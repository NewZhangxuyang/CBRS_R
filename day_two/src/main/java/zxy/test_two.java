package zxy;

import java.util.Scanner;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-04-9:45
 * @Description:根据用户输入的分数，判断用户的等级，分数范围0-100
 */
public class test_two {
    public static void main(String[] args) {
        //根据用户输入的分数，判断用户的等级
        System.out.println("请输入分数：");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("输入范围错误");
            return;
        }
        if (score >= 90) {
            System.out.println("成绩优秀");
        } else if (score >= 80) {
            System.out.println("成绩良好");
        } else if (score >= 70) {
            System.out.println("成绩一般");
        } else if (score >= 60) {
            System.out.println("成绩及格");
        } else {
            System.out.println("成绩不合格");
        }
    }
}
