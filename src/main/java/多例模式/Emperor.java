package 多例模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Emperor {
    private Emperor(){}//私有化构造器
    private Emperor(String name){//传入皇帝名称创建对象
        names.add(name);
    }
    private static final Integer MAX_COUNT_EMPEROR=2;//定义最多产生实例的数量
    private static List<String> names=new ArrayList<String>();//实例的属性
    private static List<Emperor> emperors=new ArrayList<Emperor>(MAX_COUNT_EMPEROR);//容纳实例对象的列表
    private static int numberOfEmperor=0;//皇帝编号
    //产生所有对象
    static{
        for(int i=0;i<MAX_COUNT_EMPEROR;i++){
            emperors.add(new Emperor("皇帝"+i));
        }
    }

    public static Emperor getInstance(){
        Random random=new Random();
        numberOfEmperor = random.nextInt(MAX_COUNT_EMPEROR);//随机获取一个皇帝编号
        Emperor emperor = emperors.get(numberOfEmperor);
        return emperor;
    }
}
