package 单例模式;


@SuppressWarnings("all")
public class SingleTon1 {
    private SingleTon1 (){}//私有化构造器
    private static volatile SingleTon1 singleTon;
    public static SingleTon1 getInstance(){
        if(singleTon==null){//第一层检索
            //这个静态代码块的作用就是在高并发的情况下。两个
            //线程都走过了第九行我们的第二层检索就有用了！！
          synchronized (SingleTon1.class){
              if(singleTon==null){//第二层检索
                  singleTon=new SingleTon1();
              }
          }
        }
        return singleTon;
    }
}
