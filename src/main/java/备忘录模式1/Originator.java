package 备忘录模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//发起人
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建一个备忘录
    public Memento createMemento()
    {
        return new Memento(state);
    }
    //发起人回复备忘录
    public void restoreMemento(Memento m)
    {
        this.setState(m.getState());
    }
}
