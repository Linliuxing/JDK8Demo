package Streams;

import java.util.Arrays;

/**
 * @Title: Test
 * @Description: 流API是Java 8引入了函数式编程的证明，Stream API提供了元素流的函数式操作，包括list、set、map等，
 * 还支持过滤filtering、映射mapping、移除集合中的重复元素等。可以从集合、数组、读缓冲区等获取流Stream。
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/6 12:16
 */
public class Test {

    public static void main(String[] args) {
        Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .map(n->2*n+1) //3 5 7 9 11
                .average()// (3+5+7+9+11)/5
                .ifPresent(System.out::println);
    }
}
