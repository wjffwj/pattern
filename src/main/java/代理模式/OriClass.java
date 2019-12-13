package 代理模式;

/**
 * @created by 24745
 * @date 2019/12/12
 */

public class OriClass implements OriInterface {
    @Override
    public void target() {
        System.out.println("被代理的方法");
    }
}
