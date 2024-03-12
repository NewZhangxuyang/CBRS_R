package tomcat;

import java.io.*;
import java.util.Scanner;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-11-16:07
 * @Description: 读数据的线程
 */
public class client_work_thread implements Runnable {

    private InputStream inputStream;



    private OutputStream outputStream;



    private  static  final Scanner scanner = new Scanner(System.in) ;


    private int len;
    private static final byte[] bytes = new byte[1024];

    public client_work_thread(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public client_work_thread( InputStream inputStream,OutputStream outputStream) {
        this.outputStream = outputStream;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("请输入发送的内容");
                String next = scanner.next();
                if ("exit".equals(next)) {
                    break;
                }
                PrintWriter printWriter = new PrintWriter(outputStream,true);
                printWriter.println(next);


                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(inputStream, "UTF-8"));
                String content = bufferedReader.readLine();
                System.out.println("收到服务端的消息：" + content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
