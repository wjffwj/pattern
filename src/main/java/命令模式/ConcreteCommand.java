package 命令模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */

//具体命令，调用接收者执行
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand() {
      receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
