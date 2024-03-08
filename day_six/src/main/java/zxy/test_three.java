package zxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-9:28
 * @Description: outPutStream和writer的使用
 *
 * <p>
 * 这里的写都是覆盖写
 * <p>
 * <p>
 * 如何实现追加写
 * 每次创建输出流对象，都会清空目标文件中的数据。如何保留目标文件中数据，还能继续追加新数据呢？
 * 并且实现换行呢？其实很简单，这个时候我们又要再学习FileOutputStream的另外两个构造方法了
 * <p>
 * 1、public FileOutputStream(File file, boolean append)
 * <p>
 * 2、public FileOutputStream(String name, boolean append)
 * <p>
 * 这两个构造方法，第二个参数中都需要传入一个boolean类型的值，true 表示追加数据
 * false 表示不追加也就是清空原有数据
 * 这样创建的输出流对象，就可以指定是否追加续写了
 * 至于Windows换行则是 \n\r
 */
public class test_three {


    public static void main(String[] args) {
        /**
         * 1、 public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
         *
         * 2、 public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出
         *
         * 3、 public void write(byte[] b)：将 b.length个字节从指定的字节数组写入此输出流。
         * 4、 public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
         *  也就是说从off个字节数开始读取一直到len个字节结束
         */
        OutputStream fileOutPutStream = null;

        try {
            fileOutPutStream = new FileOutputStream(new File("D:\\isofile\\io_test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            /**
             * 写入一个字节，写入的是ASCII码
             *将一个字节写入到输出流中
             *
             * 有个flush()方法，强制刷新缓冲区，将缓冲区的内容写入文件
             */
            fileOutPutStream.write(97);
            fileOutPutStream.write(98);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutPutStream.flush();
                fileOutPutStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        /**
         * 用写入字节数组
         */
        try {
            byte[] bytes = "你好".getBytes();
            fileOutPutStream.write(bytes, 2, 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileOutPutStream.flush();
                fileOutPutStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        FileOutputStream stream = null;

        try {
            /**
             * 实现的是追加写
             */
            stream = new FileOutputStream(new File("D:\\isofile\\io_test.txt"),true);
            stream.write("你好".getBytes());
            stream.write("\r\n".getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
