package 策略模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//测试类
public class TestMain {
    public static void main(String[] args) {
        Stratgy s1 = new ConcreteStratgyA();
        Context context = new Context();
        context.setStratgy(s1);
        context.stratgyMethod();
    }
}
