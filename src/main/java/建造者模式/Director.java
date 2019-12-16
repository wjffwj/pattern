package 建造者模式;



/**
 * @created by 24745
 * @date 2019/12/14
 */
//指挥者，调用建造者方法完成复杂对象创建
public class Director {

    private AbstractBuilder builder;
    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product constructA() {
        builder.buildpartA();
        builder.buildpartB();
        builder.buildpartC();
        return builder.getResult();
    }
}
