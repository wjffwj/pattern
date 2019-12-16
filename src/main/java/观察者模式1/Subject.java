package 观察者模式1;

import java.util.ArrayList;
import java.util.List;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//抽象目标
public abstract class Subject {
    public List<ObServer> obServers = new ArrayList<>();

    //增加观察者
    public void add(ObServer obServer) {
        obServers.add(obServer);
    }

    //删除观察者
    public void del(ObServer obServer) {
         obServers.remove(obServer);
    }

}
