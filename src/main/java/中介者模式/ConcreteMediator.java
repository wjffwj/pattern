package 中介者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//具体中介者
public class ConcreteMediator extends Mediator {
    private List<College> colleges = new ArrayList<>();

    //注册同事对象
    @Override
    public void registor(College college) {
        if(!colleges.contains(college)) {
            colleges.add(college);
            college.setMediator(this);
        }
    }
//如果不是本对象怎调用此对象的接受请求，中介者转发
    @Override
    public void relay(College college) {
        for(College c:colleges) {
            if(!c.equals(college)) {
                c.receive();
            }
        }
    }
}
