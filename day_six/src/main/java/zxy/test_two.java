package zxy;

import java.io.*;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-9:16
 * @Description: 字符流的读写
 */
public class test_two {

    /**
     * 1、public void close() ：关闭此流并释放与此流相关联的任何系统资源。
     * 2、 public int read()： 从输入流读取一个字符。
     * 3、 public int read(char[] c)： 从输入流中读取一些字符，并将它们存储到字符数组中
     */


    public static void main(String[] args) {

        Reader fileReader;
        {
            try {
                fileReader = new FileReader(new File("D:\\isofile\\io_test.txt"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            /**
             * 读取文件,单个字符读取
             * read()方法返回的是一个int类型的值
             *
             */
            while (fileReader.read() != -1) {
                System.out.println(fileReader.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        /**
         * 读取文件,多个字符读取
         * read(char[] c)方法返回的是一个int类型的值
         * 是读取到的字符的个数
         *
         *
         * 读取到文件末尾返回-1
         *
         */

        char[] chars = new char[1024];
        int length = 0;
        try {
         while ((length = fileReader.read(chars)) != -1) {
             System.out.println(new String(chars, 0, length));
         }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
