package 单例模式;
@SuppressWarnings("all")
public class Singleton {
    private Singleton(){}//私有化构造器
    private static final Singleton singleton=new Singleton();//限制产生多个对象
    public static Singleton getInstance(){//通过该方法获取实例对象
        return singleton;
    }
    //类中的其他方法尽量使static
    public static void doSomeThing(){
        System.out.println(singleton);
    }
}
