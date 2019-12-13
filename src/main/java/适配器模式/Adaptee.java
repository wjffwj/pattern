package 适配器模式;
/**
 * 被适配的类，
 */
public class Adaptee {
    //被适配的方法
    public void adapteeMethod(){
        System.out.println("这是我的被适配的方法，被调用了...");
    }
}
