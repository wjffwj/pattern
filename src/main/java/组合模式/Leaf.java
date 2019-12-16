package 组合模式;

/**
 * @created by 24745
 * @date 2019/12/14
 */
//树叶构件
public class Leaf implements Component {
    private String name;
    Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶：name"+name+"被访问");
    }
}
