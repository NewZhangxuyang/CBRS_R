package tomcat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-11-16:10
 * @Description: 写数据的线程
 */
public class server_work_thread implements Runnable {


    private OutputStream outputStream;


    private InputStream inputStream;
    private int len;
    private static final byte[] bytes = new byte[1024];


    private static final Scanner scanner = new Scanner(System.in);

    public server_work_thread(OutputStream outputStream) {
        this.outputStream = outputStream;
    }


    public server_work_thread(OutputStream outputStream, InputStream inputStream) {
        this.outputStream = outputStream;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {

        try {
            while (true) {

                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(inputStream, "UTF-8"));
                String copy = bufferedReader.readLine();
                System.out.println("收到客户端的消息：" + copy);

                System.out.println("请输入内容");
                String content = scanner.nextLine();
                outputStream.write(content.getBytes("UTF-8"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
