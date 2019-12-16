package 观察者模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */

public class TestMain {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        ObServer o1 = new ConcreteObServer();
        ObServer o2 = new ConcreteObServer();
        subject.add(o1);
        subject.add(o2);
        ((ConcreteSubject) subject).notifyObServers();
    }
}
