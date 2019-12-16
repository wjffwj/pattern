package 中介者模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */

//抽象中介者
public abstract class Mediator {
    //同事对象注册
    public abstract void registor(College college);
    //同事对象转发
    public abstract void relay(College college);
}
