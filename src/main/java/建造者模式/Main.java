package 建造者模式;

/**
 * @created by 24745
 * @date 2019/12/14
 */
//测试类
public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();//创建具体建造者
        Director director = new Director(builder);//指挥者设置建造者
        Product product = director.constructA();//指挥者让建造者箭造 建造者调用内部依赖的product进行设置值
        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
        System.out.println(product.getPartC());
    }
}
