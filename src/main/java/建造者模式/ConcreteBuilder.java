package 建造者模式;

/**
 * @created by 24745
 * @date 2019/12/14
 */
//具体建造者
public class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildpartA() {
        this.product.setPartA("箭造partA");
    }

    @Override
    public void buildpartB() {
        this.product.setPartB("箭造partB");
    }

    @Override
    public void buildpartC() {
        this.product.setPartC("箭造partC");
    }
}
