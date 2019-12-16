package 单例模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */

//懒汉式单例 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
public class SingleTon1 {
    private static volatile SingleTon1 instance = null;

    private SingleTon1() {
    }

    public static SingleTon1 getInstance() {
        if (instance == null) {
            synchronized (SingleTon1.class) {
                if (instance == null) {
                    instance = new SingleTon1();
                }
            }
        }
        return instance;
    }

}
