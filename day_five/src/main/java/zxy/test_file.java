package zxy;

import java.io.File;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-15:42
 * @Description: File类操作
 * <p>
 * 以传输方式区分：
 * 字节流读取单个字节,字节流用来处理二进制文件(图片、MP3、视频文件)
 * <p>
 * 字符流读取单个字符(一个字符根据编码的不同，对应的字节也不同，如 UTF-8 编码中文汉字是 3 个字节，GBK编码中文汉字是 2 个字节)
 * 字符流用来处理文本文件(可以看做是特殊的二进制文件，使用了某种编码，人可以阅读)
 * <p>
 * 以数据流向区分：
 * 输入流：从文件中读取数据
 * 输出流：向文件中写入数据
 * <p>
 * 以操作对象区分：
 * 文件流：操作文件，将文件写入文件，或者从文件中读取文件
 * 数组流：操作数组，将数组写入文件，或者从文件中读取数组
 * 管道流：操作管道，线程间通信
 * 对象流：操作对象，将对象写入文件，或者从文件中读取对象
 * 打印流：操作打印，输出到控制台
 * 缓冲流：操作缓冲
 * 转换流：操作转换，将字节流转换为字符流
 * 基本数据流：操作基本数据
 * 序列化流：操作序列化
 */
public class test_file {


    public static void main(String[] args) {
        File file = new File("D:\\isofile\\io_test.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        //返回的是文件的父目录,是一个File对象
        File parentFile = file.getParentFile();
        File childeFile = new File(parentFile, "io_test\\io_test1\\io_test2");
        File loopFile = new File("D:\\isofile222\\io_test33\\io_test1333\\io_test23333");
        //创建文件夹
        System.out.println(childeFile.mkdirs());
        System.out.println(loopFile.mkdirs());
    }


}
