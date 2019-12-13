package 备忘录模式;

/**
 * @created by 24745
 * @date 2019/8/4
 */

public class Main {
    public static void main(String[] args) {
        People p = new People();
        //定义备忘录管理员
        Manager manager = new Manager();
        //创建备忘录
        manager.setMemento(p.createMemento());

        p.setState("心情糟糕");



        //修复一个备忘录
        p.restoreMemento(manager.getMemento());
        System.out.println(p.getState());
    }

}
