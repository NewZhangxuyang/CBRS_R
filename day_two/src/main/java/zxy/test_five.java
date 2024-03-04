package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-04-14:23
 * @Description: 数组遍历
 */
public class test_five {

    public static void main(String[] args) {
        //数组遍历
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //数组遍历,增强for循环
        for (int i : arr) {
            System.out.println(i);
        }
        //利用Stream流遍历数组
        java.util.Arrays.stream(arr).forEach(temp -> System.out.println(temp));


    }
}
