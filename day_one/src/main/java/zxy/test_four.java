package zxy;

import java.util.Scanner;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-01-17:22
 * @Description: 输入一个年份，判断是否是闰年
 */
public class test_four {
    /**
     * 闰年的判断条件：普通年能被四整除且不能被100整除的为闰年
     */
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入一个年份：");
            int year = input.nextInt();
            //四百年必须润
            System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? year + "是闰年" : year + "是平年");
        }
    }
}
