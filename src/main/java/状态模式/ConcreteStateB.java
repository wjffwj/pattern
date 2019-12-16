package 状态模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//具体状态类B
public class ConcreteStateB extends State {
    @Override
    public void handle(Contexc contexc) {
        contexc.setState(new ConcreteStateA());
        System.out.println("当前状态是B");

    }
}
