package zxy;

import java.util.Arrays;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-18:10
 * @Description:
 *     四次挥手的详情
 */
public class tcp_explain {

    /**
     * 第一次挥手(FIN=1，seq=x)
     * 假设客户端想要关闭连接，客户端发送一个 FIN 标志位置为1的包，表示自己已经没有数据可以发送了，但是仍然可以接受数据。
     * 发送完毕后，客户端进入 FIN_WAIT_1 状态。
     *
     *
     *
     * 第二次挥手(ACK=1，ACKNUM=x+1)
     * 服务器端确认客户端的 FIN 包，发送一个确认包，表明自己接受到了客户端关闭连接的请求，但还没有准备好关闭连接。
     * 发送完毕后，服务器端进入 CLOSE_WAIT 状态，客户端接收到这个确认包之后，进入 FIN_WAIT_2 状态，等待服务器端关闭连接。
     *
     *
     *
     * 第三次挥手(FIN=1，seq=y)
     * 服务器端准备好关闭连接时，向客户端发送结束连接请求，FIN 置为1。
     * 发送完毕后，服务器端进入 LAST_ACK 状态，等待来自客户端的最后一个ACK。
     *
     *
     *
     * 第四次挥手(ACK=1，ACKnum=y+1)
     * 客户端接收到来自服务器端的关闭请求，发送一个确认包，并进入 TIME_WAIT状态，等待可能出现的要求重传的 ACK 包。
     * 服务器端接收到这个确认包之后，关闭连接，进入 CLOSED 状态。
     *
     *
     *
     * 客户端等待了某个固定时间（两个最大段生命周期，2MSL，2 Maximum Segment Lifetime）之后，没有收到服务器端的 ACK ，认为服务器端已经正常关闭连接，于是自己也关闭连接，进入 CLOSED 状态
     */


    public static void main(String[] args) {
        Object [] os = new Object[10];
        os[0] = new String("123");
        os[1] = new String("123");
        os[2] = new String("123");
        os[3] = new String("123");
        /**
         * java.lang.ClassCastException:
         * class [L java.lang.Object   cannot be  cast to class [L java.lang.String
         *
         *类型转换异常
         * 在java中，Object是所有class类型的根
         * 数组当然也是一种class类型，[ L java.lang.****类型,对象类型的顶级父类都是Object
         * 因此Object[]类型和Coffee[]类型，都是Object类型的子类型
         * 但是对于Object[]类型和Coffee[]类型，二者同为数组类型，可他们之间并没有什么父子关系，而是平级的关系
         *
         */
        String [] ss = new String[10];
        ss = (String[]) os;
        System.out.println(Arrays.toString(ss));


        /**
         *  OutPutStreamWriter是字符流通向字节流的桥梁
         *参数是接收一个字节流
         *大概的含义是将一些字符写入这个包装内的字节流中
         * 实现将字符转换成字节流
         *
         *
         *
         * InputStreamReader  是字节流通向字符流的桥梁
         *
         */


    }

}
