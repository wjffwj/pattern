package 装饰器模式;

/**
 * @created by 24745
 * @date 2019/12/12
 */

public class ConcreteDepretor extends AbstractDepretor {
    public ConcreteDepretor(Grade grade) {
        super(grade);
    }

    @Override
    public void report() {
        System.out.println("开始装饰");
        super.report();
    }
}
