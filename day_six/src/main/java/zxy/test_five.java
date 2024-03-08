package zxy;

import java.io.*;
import java.nio.Buffer;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-10:16
 * @Description: 带缓冲区的流
 */
public class test_five {

    /**
     * 使用了底层流对象从具体设备上获取数据，并将数据存储到缓冲区的数组内。
     * 通过缓冲区的read()方法从缓冲区获取具体的字符数据，这样就提高了效率。
     *
     * 3、读取字符数据，并存储到jvm定义的缓冲区中
     *   直到读取到了换行符时，将另一个容器临时存储的数据转成字符串返回
     *  就形成了readLine()功能
     */
    public static void main(String[] args) {

        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(
                    new FileInputStream("D:\\isofile\\io_test.txt")
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ;
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(
                    new FileReader("D:\\isofile\\io_test.txt")
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        /**
         * 字符缓冲流具备的特有方法
         * BufferedReader：public String readLine(): 读一行数据。 读取到最后返回null
         * BufferedWriter：public void newLine(): 换行,由系统属性定义符号。
         *
         *
         *字符缓冲区可以实现一次读取一行数据的功能
         *
         */
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                /**
                 * 这里是自动刷新缓冲区的，不需要手动刷新
                 */
                bufferedReader.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        /**
         *
         * 特点
         * BufferedWriter有个newLine()方法，可以实现换行
         */
    }
}
