package 代理模式;

/**
 * @created by 24745
 * @date 2019/12/12
 */

public class Proxy implements OriInterface {
    private OriClass oriClass= new OriClass();
    @Override
    public void target() {
        System.out.println("before tran");
        oriClass.target();
        System.out.println("after tran");
    }
}
