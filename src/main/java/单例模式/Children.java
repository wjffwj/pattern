package 单例模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SuppressWarnings("all")
public class Children {
    private Children(){}//私有化构造器就两个孩子不能整多了
    private Children(String name){
        names.add(name);
    }
    private static List<String> names=new ArrayList<String>();//孩子的名字
    private static List<Children> childs=new ArrayList<Children>();//孩子对象列表
    private static final int MAX_SIZE_OF_CHILD=2;//孩子数就这么多别变，养不起
    static{
        for(int i=0;i<MAX_SIZE_OF_CHILD;i++){//对象实例化
            childs.add(new Children("孩子"+(i+1)));
        }
    }
    public static Children  getInstance(){//随机找个儿子
        Random random = new Random();
        int i = random.nextInt(MAX_SIZE_OF_CHILD);
        Children children = childs.get(i);
        return children;
    }
}
