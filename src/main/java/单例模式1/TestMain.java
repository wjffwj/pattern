package 单例模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */

/**
 * 单例模式1.SingleTon3@1540e19d
 * 单例模式1.SingleTon3@1540e19d
 */
public class TestMain {
    public static void main(String[] args) {
        SingleTon3 singleTon3 = SingleTon3.getInstance();
        SingleTon3 instance = SingleTon3.getInstance();
        System.out.println(singleTon3);
        System.out.println(instance);
    }
}
