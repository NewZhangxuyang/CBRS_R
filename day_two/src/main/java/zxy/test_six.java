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
         * 快速排序partition分区方法
         * 1.单侧指针移动
         */
        {
            //以最后一个元素为基准
            int low = 0;
            int high = array.length - 1;
            int pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (array[j] < pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        /**
         * 快速排序partition分区方法
         * 2.双侧指针移动
         */
        {
            //模拟初始化的上下界
            int low = 0;
            int high = array.length - 1;

            int pivot = array[low + (high - low) / 2];

            //指针
            int i = low - 1;
            int j = high + 1;


            //以相遇为跳出条件
            while (true){
                //将左指针向右移动，直到找到大于或等于基准点的元素
                do{
                    i++;
                }while (array[i] < pivot);

                // 将右指针向左移动，直到找到小于或等于基准点的元素
                do {
                    j--;
                }while (array[j] > pivot);

                // 确定分区点的下标
                if(i >= j){
                    // 分区点为j

                    //return j;
                }

                //交换逆序对
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

}
