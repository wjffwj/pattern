package 观察者模式;

import java.util.Vector;

/**被观察者
 * @created by 24745
 * @date 2019/8/4
 */

public abstract class Subject {
    //观察者数组
    private Vector<ObServer> obServers = new Vector<>();

    //增加一个观察者
    public void addObServer(ObServer obServer) {
        this.obServers.add(obServer);
    }

    //删除一个观察者
    public void delObServer (ObServer o) {
        this.obServers.remove(o);
    }

    //通知所有观察者
    public void notifyObServers() {
        for (ObServer o : obServers) {
            o.update();
        }
    }

}
