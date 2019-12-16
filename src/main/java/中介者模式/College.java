package 中介者模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//抽象同事类
public abstract class College {
    protected Mediator mediator;//抽象中介者

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();//同事对象交互方法
    public abstract void send();//同事对象交互方法
}
