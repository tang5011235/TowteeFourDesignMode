package test.towteefourdesignmode;

/**
 * Created by Administrator on 2017/12/12.
 */

public class SingleMode_eHan {
    private static final SingleMode_eHan SInstance  = new SingleMode_eHan();

    private SingleMode_eHan() {
    }

    public static SingleMode_eHan getInstance(){
        return SInstance;
    }
}
