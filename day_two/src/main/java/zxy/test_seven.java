package zxy;

import java.util.Arrays;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-04-15:17
 * @Description: 输出一个三行四列的矩阵
 */
public class test_seven {
    public static void main(String[] args) {

        //输出一个三行四列的矩阵
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int [] arr1 = {1,2,7,4,5};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }


}
