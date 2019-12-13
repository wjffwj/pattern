package 桥接模式;

/**测试方法调用*/
public class Main {
    public static void main(String[] args) {
        Implementer impl = new ConcreteImplementer();
        Abstraction abstraction = new ConcreteAbstraction(impl);
        abstraction.dosomething();
    }
}
