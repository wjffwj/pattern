package 多例模式;

public class Minister {
    public static void main(String[] args) {
        int count=5;
        for(int i=0;i<count;i++){
            Emperor emperor=Emperor.getInstance();
            System.out.println(emperor);
        }
    }
}
