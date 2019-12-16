package 命令模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */

public class Main {
    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.setCommand(command);
        invoker.call();
    }
}
