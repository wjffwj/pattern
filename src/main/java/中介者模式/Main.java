package 中介者模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */

public class Main {
    public static void main(String[] args) {
        Mediator md=new ConcreteMediator();
        College c1,c2;
        c1=new ConcreteCollege1();
        c2=new ConcreteCollege2();
        md.registor(c1);
        md.registor(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
