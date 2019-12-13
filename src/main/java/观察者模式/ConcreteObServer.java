package 观察者模式;

/**
 * 具体观察者
 * @created by 24745
 * @date 2019/8/4
 */

public class ConcreteObServer implements ObServer {

    @Override
    public void update() {
        System.out.println("接收到消息，开始处理");
    }

}
