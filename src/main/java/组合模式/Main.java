package 组合模式;

/**
 * @created by 24745
 * @date 2019/12/14
 */

public class Main {
    public static void main(String[] args) {
        Component c = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");


        c.add(leaf1);
        c.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);

        c.operation();
    }
}
