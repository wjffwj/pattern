package 备忘录模式;

/**
 * 备忘录
 * @created by 24745
 * @date 2019/8/4
 */

public class Memento {
    private String state ;

    public Memento(String _state) {
        this.state = _state;
    }

    public Memento() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
