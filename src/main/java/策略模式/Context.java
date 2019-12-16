package 策略模式;

/**
 * @created by 24745
 * @date 2019/12/16
 */
//环境类决定具体哪个策略被使用
public class Context {
    private Stratgy stratgy;

    public void stratgyMethod(){
        stratgy.stratgyMethod();
    }


    public Stratgy getStratgy() {
        return stratgy;
    }

    public void setStratgy(Stratgy stratgy) {
        this.stratgy = stratgy;
    }
}
