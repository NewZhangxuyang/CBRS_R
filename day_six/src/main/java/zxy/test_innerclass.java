package zxy;

import java.util.*;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-16:38
 * @Description: 内部类的相关知识
 */
public class test_innerclass extends Throwable {


    private String name = "zhangXuYang";

    private void test() {
        System.out.println("外部类的方法");
    }

    public void visitInner() {
        new Inner().door();

    }

    class Inner {


        /**
         * 缺省构造方法
         */
        void Inner() {
            System.out.println("内部类的构造方法");
        }

        public Inner() {
            System.out.println("内部类的构造方法");
        }

        /**
         * 构造方法可以带void
         * @param s
         */

        public  void Inner(String s) {
            System.out.println("内部类的构造方法");
        }


        double d = 14.0;

        private String name = "zhangXuYang";

        public void door() {
            System.out.println("内部类的方法");
        }

    }

    static int[] a = new int[10];

    public static void main(String[] args) {
        String s = "We are students";
        System.out.println(a[1]);

        float f = 2;
        float f1 = 1.0f;
        System.out.println(s.length());

        ArrayList arrayList = new ArrayList();

        ArrayList <String>  strings = new ArrayList<String>();


        ArrayList <String>  arrayList1 = new ArrayList();


        Map <String , Integer> map  = new HashMap<String , Integer>();

        Set <String> set = new HashSet <String>();
        Iterator <String> iterator = set.iterator();

        System.out.println(4+8+"hello");


        int x = -10;
        int y = -3;

        System.out.println(x%y);

    }


}
