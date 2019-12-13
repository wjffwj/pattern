package 原型模式;

//原型模式测试类
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Class1 object = new Class1();
        object.setName("Jeff");
        Class1 clone = object.clone();
        //判断克隆出的对象是否是同一个
        System.out.println(clone == object);
        //判断设置好的对象中的属性能否一起被克隆过来
        System.out.println(object.getName().equals(clone.getName()));
        /***
         * 输出结果
         * false
         * true
         */
    }
}
