package 备忘录模式1;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//管理者
public class CareTaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
