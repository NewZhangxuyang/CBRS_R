package zxy;

import java.io.*;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-9:00
 * @Description: java的序列化
 * ObjectOutputStream 是将对象写入流中
 * ObjectInputStream 是从流中读取对象
 * <p>
 * <p>
 * Java序列化是指把Java对象转换为字节序列的过程，而Java反序列化是指把字节序列恢复为Java对象的过程
 * 序列化时并不保存静态变量，这其实比较容易理解，序列化保存的是对象的状态，静态变量属于类的状态
 * 因此 序列化并不保存静态变量
 * <p>
 * <p>
 * <p>
 *
 * 对象序列化的最主要的用处就是在传递和保存对象的时候，保证对象的完整性和可传递性
 * 序列化是把对象转换成有序字节流，以便在网络上传输或者保存在本地文件中
 * 核心作用是对象状态的保存与重建。
 *
 * 客户端从文件中或网络上获得序列化后的对象字节流，根据字节流中所保存的对象状态及描述信息，通过反序列化重建对象
 *
 *
 * PrintWriter 采用的字符集是默认的字符集
 * PrintWriter 可以实现字节流和字符流的转换
 */
public class test_one {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("student.txt"));
        test_domain_student student = new test_domain_student("zhang", 18, 100, "beijing");
        obj.writeObject(student);
        obj.close();
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("student.txt"));
        try {
            test_domain_student student1 = (test_domain_student) objIn.readObject();
            System.out.println(student1.toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            objIn.close();
        }


    }
}
