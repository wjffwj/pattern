package 建造者模式;

/**
 * @created by 24745
 * @date 2019/12/14
 */

//产品角色
public class Product {
    private String partA;
    private String partB;
    private String partC;


    public void show() {
        //显示产品的特性
    }


    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
