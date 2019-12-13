package 适配器模式;
/**
 * 适配器
 */
public class Adaptor extends Adaptee implements Target {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("适配器已经开始了适配");
        adaptee.adapteeMethod();
    }
}
