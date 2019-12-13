package 适配器模式;
public class AdaptorTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adaptor(adaptee);
        target.request();
    }
}
