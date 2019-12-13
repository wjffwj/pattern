package 面试;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        try {
            Class<?> aClass = Class.forName("面试.Test1");
            Method[] methods = aClass.getMethods();
            List<Method> list = Arrays.asList(methods);
            list.stream().forEach(item->{
                System.out.println(item);
            });
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
