package 桥接模式;

/**
 * @created by 24745
 * @date 2019/12/12
 */
/**具体桥接类，将Implementer桥接进来*/
public class ConcreteAbstraction extends Abstraction {

    public ConcreteAbstraction(Implementer implementer) {
        super(implementer);
    }

    @Override
    public void dosomething() {
        System.out.println("桥接是我自己的方法");
        implementer.oprationImpl();
    }
}
