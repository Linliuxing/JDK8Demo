package MethodRef;

import java.util.Arrays;

/**
 * @Title: Test
 * @Description: 方法引用：可以使用Lambda表达式来创建匿名方法。
 * 但是，Lambda表达式不只是调用现有的方法。
 * 在某些情况下，它也经查用于明确使用方法名来指定现有的方法。
 * 通过名字来使用方法引用，代码显得更紧凑、易读。
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/6 12:14
 */
public class Test {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "c").forEach(new Test()::show);
    }
    public void show(String str){
        System.out.print(str + " ");
    }

}
