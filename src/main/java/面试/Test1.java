package 面试;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args)  {
        String a=null;
        System.out.println(2);
            if(a.equals("abc")) {
                throw new NullPointerException();
            }

        System.out.println(1);

    }
    public void sayHello(){
        System.out.println("hello,world");
    }
}
