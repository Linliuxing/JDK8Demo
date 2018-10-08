package interfaceTest;

/**
 * @Title: Man
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/6 11:49
 */
public class Man implements Person{

    //sing()是Person的抽象方法，必须要实现这个方法
    //swing（）Person的静态方法，不能被实现和调用
    @Override
    public void sing() {
        System.out.println("I can sing");
    }

    /*
    display是Person中使用default关键字来修饰的方法，非必实现，
    若实现，调用的是Man中的实现结果，不然调用的是Person接口中的默认实现
     */
    @Override
    public void display() {
        System.out.println("I can display");
    }
}
