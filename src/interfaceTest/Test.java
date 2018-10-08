package interfaceTest;

/**
 * @Title: Test
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/6 11:44
 */
public class Test {
    public static void main(String[] args) {
        //调用接口定义的静态方法，只需使用接口名就可以访问这些静态方法
        //Person.swing();

        Man man = new Man();
        //man.sing();
        //若实现display，调用的是Man中的实现结果，
        //不然调用的是Person接口中的默认实现
        //man.display();

        Person person = man;
        person.sing();
        //调用的是Man中的实现结果
        person.display();

    }
}
