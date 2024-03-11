package tomcat;

import java.io.IOException;
import java.net.Socket;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-11-14:53
 * @Description: 客户端类
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            server_work_thread writerThread = new server_work_thread(socket.getOutputStream(), socket.getInputStream());
            new Thread(writerThread).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
