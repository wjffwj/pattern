package 观察者模式;

/**
 * @created by 24745
 * @date 2019/8/4
 */

public class Main {
    public static void main(String[] args) {
        Subject subject =new ConcreteSubject();
        ObServer obServer =new ConcreteObServer();
        subject.addObServer(obServer);
        ((ConcreteSubject) subject).doSomeThing();
    }
}
