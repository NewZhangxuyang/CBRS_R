package zxy;

import java.util.HashMap;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-14:24
 * @Description: put(key, value) 方法的源代码可以看出，当程序试图将一个 key-value 对放入 HashMap 中时
 * 程序首先根据该 key 的 hashCode() 返回值决定该 Entry 的存储位置
 * 如果两个Entry的 key 的 hashCode() 返回值相同，那它们的存储位置相同
 * 如果这两个Entry的 key 通过 equals 比较返回 true
 * 新添加 Entry 的 value 将覆盖集合中原有 Entry 的 value，但 key 不会覆盖
 */
public class test_map {


    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>(100, 0.8f);
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");

    }

}
