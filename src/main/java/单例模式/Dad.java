package 单例模式;

public class Dad {
    public static void main(String[] args) {
        Integer x=7;
        for(int i=1;i<=7;i++){
            Children instance = Children.getInstance();
            System.out.println(instance);
        }
    }
}
