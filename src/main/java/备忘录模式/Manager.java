package 备忘录模式;

/**
 * 备忘录管理员
 * @created by 24745
 * @date 2019/8/4
 */

public class Manager {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
