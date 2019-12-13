package 模板方法模式;

//模板具体实现
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("模板方法1被调用");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("模板方法2被调用");
    }
}
