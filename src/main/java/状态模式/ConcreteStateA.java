package 状态模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//具体状态类A
public class ConcreteStateA extends State {

    @Override
    public void handle(Contexc contexc) {
        System.out.println("当前状态是A");
        contexc.setState(new ConcreteStateB());

    }
}
