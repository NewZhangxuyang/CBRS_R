package tomcat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-11-14:40
 * @Description: 服务器套接字
 */
public class Server {
    public static void main(String[] args) {


        /**
         * 启动服务器监听线程
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ServerSocket socketServer = new ServerSocket(8888);
                    /**
                     * 持续监听
                     */
                    while (true){
                    Socket socket = socketServer.accept();
                    client_work_thread serverReadThread = new client_work_thread(socket.getInputStream(), socket.getOutputStream());
                    new Thread(serverReadThread).start();
                    }
                    /**
                     * inputStream
                     * read()方法是阻塞的，当客户端没有发送数据的时候，服务端会一直等待
                     * 只有当客户端关闭它的输出流的时候，服务端才能取得结尾的-1
                     */
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }


}
