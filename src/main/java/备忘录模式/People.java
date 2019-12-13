package 备忘录模式;

/**
 * 发起人
 * @created by 24745
 * @date 2019/8/4
 */

public class People {
    private String state = "超级开心";

    /**
     * 创建一个备忘录
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复一个备忘录
     * @return
     */
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }




    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
