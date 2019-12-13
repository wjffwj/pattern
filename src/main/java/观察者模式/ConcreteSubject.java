package 观察者模式;

/**
 * 具体的被观察者
 * @created by 24745
 * @date 2019/8/4
 */

public class ConcreteSubject extends Subject {

    public void doSomeThing() {
        System.out.println("被观察者做事情了");
        super.notifyObServers();
    }

}
