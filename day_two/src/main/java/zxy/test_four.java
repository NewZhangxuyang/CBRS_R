package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-04-11:01
 * @Description:选定基值，将数组分成两部分，左边的数都小于基值，右边的数都大于基值
 */
public class test_four {
    //数组分区
    public static int partition(int[] arr, int left, int right) {
        int base = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= base) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= base) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = base;
        return left;
    }

}
