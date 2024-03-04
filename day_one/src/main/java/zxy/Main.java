package zxy;

public class Main {
    public static void main(String[] args) {
        //字节型
        byte b = 1;
        //短整型
        short s = 2;
        //整型范围是-2^31~2^31-1
        int i = 3;
        long l = 4;
        //单精度浮点型
        float f = 5.0f;
        //双精度浮点型
        double d = 6.0;
        //字符型
        char c = 'a';
        //布尔型
        boolean bool = true;


        //输出所有包装类的最大值和最小值
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);

        int a = 666;
        //输出变量类型
        System.out.println("a = " + a);
        //System.out.println("Hello world!");

    }
}