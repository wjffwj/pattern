package 原型模式;

//原型类           Cloneable是抽象原型接口
public class Class1 implements Cloneable {
    private String name;

    @Override
    protected Class1 clone() throws CloneNotSupportedException {
        return (Class1) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
