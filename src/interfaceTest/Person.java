package interfaceTest;

/**
 * @Title: Person
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/6 11:43
 */
public interface Person {

    abstract void sing();

    //静态方法
    public static void swing(){
        System.out.println("I can swing");
    }

    //在Java 8中，可以通过使用default关键字来添加默认的方法实现
    default void display(){
        System.out.println("default method of interface");
    }
}
