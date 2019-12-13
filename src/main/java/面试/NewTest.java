package 面试;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;

public class NewTest {
    public static void main(String[] args) {
        String a = new String();
        System.out.println(a);
        Test3<Student> test3=new Test3<>();
        List<Student> list=new ArrayList<>();
        Student s=new Student(1,"haha");
        Student s1=new Student(2,"gege");
        list.add(s);list.add(s1);
        test3.setList(list);

        System.out.println(1);
    }
}
