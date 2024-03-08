package zxy;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-07-17:29
 * @Description:
 */
public class test_examine {
    public static void main(String[] args) {
        Map map = Collections.EMPTY_MAP;


        Collection map_value = map.values();
        map_value.stream().forEach(System.out::println);
    }
}
