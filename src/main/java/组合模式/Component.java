package 组合模式;

/**
 * @created by 24745
 * @date 2019/12/14
 */
//抽象构件
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}
