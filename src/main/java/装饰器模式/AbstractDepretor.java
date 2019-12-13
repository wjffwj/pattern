package 装饰器模式;

/**
 * @created by 24745
 * @date 2019/12/12
 */

public abstract class AbstractDepretor extends Grade {
    private  Grade grade;

    public AbstractDepretor(Grade grade) {
        this.grade = grade;
    }

    @Override
    public void report() {
        this.grade.report();
    }
}
