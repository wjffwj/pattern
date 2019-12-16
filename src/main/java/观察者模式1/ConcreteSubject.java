package 观察者模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */

public class ConcreteSubject extends Subject {
    //通知观察者
    public void notifyObServers() {
        System.out.println("具体目标发生改变");
        System.out.println("--------------");
        for(ObServer ob:obServers) {
            ob.response();
        }
    }
}
