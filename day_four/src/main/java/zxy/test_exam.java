package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-17:21
 * @Description:
 *
 *
 *
 *
 */
public class test_exam  implements exam{
    public static void main(String[] args) {


    }

    @Override
    public int test() {
        return 2+a;
    }
}


interface exam{

    public  static  final  int a = 1;


    int test();
}
