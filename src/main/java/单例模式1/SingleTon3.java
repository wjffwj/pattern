package 单例模式1;


/**内部类方式实现单例模式*/
public class SingleTon3 {

    private SingleTon3() {
    }

    private static class InnerClass {
        private static final SingleTon3 instance = new SingleTon3();
    }

    public static SingleTon3 getInstance() {
        return InnerClass.instance;
    }
}
