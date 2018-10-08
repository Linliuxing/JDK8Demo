package Optional;

import java.util.Optional;

/**
 * @Title: Test
 * @Description: Java 8在java.util包中新增了Optional类，Optional类是一个可以包含或不可以包含非空值的容器对象。
 * 每一个Java项目，最主要的重复语句就是检查空指针异常NullPointerException。
 * 我们使用任何对象，都需要检查此对象是否为空，如果对象不为空我们才执行处理语句。
 * Optional类像是一个容器，它保存一个类型为的值或是null值。通过使用Optional类的isPresent()方法，我们可以检查指定的对象是否为空。
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/8 11:10
 */
public class Test {

    public static void main(String[] args) {
        Optional<String> str = Optional.ofNullable(null);
        System.out.println("str having value ? " + str.isPresent());
        // output : str having value ? false
    }
}
