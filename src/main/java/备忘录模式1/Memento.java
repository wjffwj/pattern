package 备忘录模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//备忘录
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
