package 模板方法模式;

/**
 * 模板类
 */
public abstract class AbstractClass {
    public void specicMethod() {
        System.out.println("抽象类中具体方法被调用");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();

    public void templateMethod(){
        specicMethod();
        abstractMethod1();
        abstractMethod2();
    }
}
