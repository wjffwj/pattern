package 观察者模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */

public class ConcreteObServer implements ObServer {

    @Override
    public void response() {
        System.out.println("具体观察者1做出反应。。。");

    }
}
