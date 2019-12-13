package 模板方法模式;

/**
 * @created by 24745
 * @date 2019/12/12
 */

public class Test {
    public static void main(String[] args) {
        AbstractClass object = new ConcreteClass();
        object.templateMethod();
    }
}
