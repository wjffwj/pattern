package 建造者模式;

/**
 * @created by 24745
 * @date 2019/12/14
 */

//抽象建造者 箭造对象的各个属性
public abstract class AbstractBuilder {
    //创建产品对象
    protected Product product=new Product();
    public abstract void buildpartA();
    public abstract void buildpartB();
    public abstract void buildpartC();

    public Product getResult() {
        return product;
    }
}
