package lambda;

import java.util.Arrays;

/**
 * @Title: Test
 * @Description: Java 8中最令人激动的特性就是Lambda表达式，它能够把函数/动作作为参数传递给方法
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/6 12:06
 */
public class Test {
    public static void main(String[] args) {
        Arrays.asList("j", "a", "v", "a", "8").forEach(e->System.out.print(e));
    }
}
