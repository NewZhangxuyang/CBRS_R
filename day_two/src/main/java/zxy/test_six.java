package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-04-14:51
 * @Description: 1.找出数组中的最大值，两种方法,解析排序的关键步骤
 * 2.实现partition方法，解析快速拍序的关键步骤
 */
public class test_six {

    public static void main(String[] args) {
        //无序数组
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        /**
         * 选择法
         */
        {   //模拟外层的一趟循环
            int i = 0;

            //内层的一趟选择
            int tempIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[tempIndex]) {
                    tempIndex = j;
                }
            }
        }
        /**
         * 冒泡法
         */
        {
            //模拟外层的一趟循环
            int i = 0;
            //内层的一趟冒泡
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

        /**
         * partition分区方法
         */


        {


        }


    }

}
