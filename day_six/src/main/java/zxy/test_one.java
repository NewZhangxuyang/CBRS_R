package zxy;

import java.io.*;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-8:42
 * @Description: 各种输入流的操作
 */
public class test_one {


    public static void main(String[] args) {

        /**
         * InputStream是字节输入流的抽象类,是所有字节输入流的超类
         */
        InputStream inputStream;
        /**
         * FileInputStream是文件输入流
         * 初始化操作，要处理异常
         */
        InputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(new File("D:\\isofile\\io_test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        /**
         * 1、public void close()     关闭此输入流并释放与此流相关联的任何系统资源。
         * 2、public abstract int read()   从输入流读取数据的下一个字节。
         * 3、public int read(byte[] b)    该方法返回的int值代表的是读取了多少个字节，读到几个返回几个，读取不到返回-1
         */


        /**
         * 读取文件,单个字节读取
         *
         * read()方法返回的是一个int类型的值
         * 是读取到的字节的ASCII码
         *
         * 读取到文件末尾返回-1
         */
        try {
            int read = 0;
            while (read != -1) {
                read = fileInputStream.read();
                System.out.println(read);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /**
         * 读取文件,多个字节读取
         * read(byte[] b)方法返回的是一个int类型的值
         * 读取到文件末尾返回-1
         *
         * byte[] b = new byte[1024];
         *
         * 每次完全读取的话，会替换掉数组中的所有数据
         * 当最后一次读取时，肯只读取少量字节，数组中，上次读取的数据没有被完全替换
         * 所以，返回的int值代表的是读取了多少个字节，读到几个返回几个，读取不到返回-1
         *
         * 输出时，要注意，只输出有效数据
         *
         */

        //有效长度
        int length = 0;
        byte[] b = new byte[1024];
        try {
            while ((length = fileInputStream.read(b)) != -1) {
                System.out.println(b);
            }
        } catch (Exception e) {
        } finally {

            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }

}
