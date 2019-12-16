package 状态模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//环境类
public class Contexc {
    private State state;

    //定义环境类的初始状态
    public Contexc() {
        state = new ConcreteStateA();
    }

    //设置新的状态
    public void setState(State state) {
        this.state = state;
    }

    //读取状态
    public State getState () {
        return state;
    }
    public void handle(){
        state.handle(this);
    }


}
