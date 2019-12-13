package 桥接模式;

/**原接口具体实现*/
public class ConcreteImplementer implements Implementer {
    @Override
    public void oprationImpl() {
        System.out.println("这是原有的方法实现...");
    }
}
