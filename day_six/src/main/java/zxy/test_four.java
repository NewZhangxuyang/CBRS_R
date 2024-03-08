package zxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.Buffer;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-10:09
 * @Description: 字符输出流
 * <p>
 * 输出以字符为单位的数据
 */
public class test_four {


    public static void main(String[] args) {
        Writer writer = null;
        try {
            //追加写
            writer = new FileWriter(new File("D:\\isofile\\io_test.txt"), true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        char[] chars = "月落乌啼霜满天，江枫渔火对愁眠。".toCharArray();
        try {
            writer.write(chars);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                writer.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }



    }
}
