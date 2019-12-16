package 策略模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */

//具体策略A
public class ConcreteStratgyA implements Stratgy {
    @Override
    public void stratgyMethod() {
        System.out.println("执行了具体策略A");
    }
}
