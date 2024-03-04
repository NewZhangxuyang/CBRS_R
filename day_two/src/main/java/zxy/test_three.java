package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-04-10:44
 * @Description: 用双重for循环，实现99乘法表
 */
public class test_three {
    public static void main(String[] args) {
        //用双重for循环，实现99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
