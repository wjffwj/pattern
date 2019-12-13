package 装饰器模式;

/**
 * @created by 24745
 * @date 2019/12/12
 */

public class Main {
    public static void main(String[] args) {
        Grade grade = new ConcreteGrade();
        Grade grade1 = new ConcreteDepretor(grade);
        grade1.report();
    }
}
