package zxy;

import java.io.File;
import java.util.Scanner;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-16:14
 * @Description: 接收用户输入，获取某路径下的所有文件
 */
public class test_file_exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入路径：");
        String path = scanner.nextLine();
        File file = new File(path);
        if (!file.exists()){
            System.out.println("路径不存在");
            return;
        }else if (file.isFile()){
            System.out.println("不是目录路径");
            return;
        }
        /**
         * file.listFiles() 返回的是一个File数组
         * 是某个目录下的所有文件
         */
        System.out.println("总共有"+recursion(file)+"个文件");
    }


    public static int recursion(File file){
        /**
         * 递归获取文件夹下的所有文件
         */
        /**
         * total += recursion(f) 递归调用
         * 只会返回某子目录下的所有文件数
         */
        int total = 0;
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()){
                    total += recursion(f);
                }else {
                    System.out.println(f.getName());
                    total++;
                }
            }
        }
        return total;
    }
}
