package 中介者模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//具体同事类1
public class ConcreteCollege1 extends College {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求...");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求...");
        mediator.relay(this);//请求中介者转发
    }
}
