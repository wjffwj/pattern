package 桥接模式;

/**
 * @created by 24745
 * @date 2019/12/12
 */
/**聚合关系建立在抽象层*/
public abstract class Abstraction {
    protected Implementer implementer;

    public Abstraction(Implementer implementer) {
        this.implementer = implementer;
    }

    public abstract void dosomething();
}
