package 命令模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//调用者 派发命令
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
