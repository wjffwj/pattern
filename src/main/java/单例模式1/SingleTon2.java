package 单例模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//饿汉式
public class SingleTon2 {
    private static final SingleTon2 instance = new SingleTon2();

    private SingleTon2() {
    }

    public static SingleTon2 getInstance() {
        return instance;
    }
}
