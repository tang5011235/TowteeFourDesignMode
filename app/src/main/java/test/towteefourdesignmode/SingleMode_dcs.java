package test.towteefourdesignmode;

/**
 * Created by Administrator on 2017/12/12.
 */

public class SingleMode_dcs {
    private static SingleMode_dcs SInstance;

    private SingleMode_dcs() {
    }

    public static SingleMode_dcs getInstance() {
        if (SInstance == null) {
            synchronized (SingleMode_dcs.class) {
                SInstance = new SingleMode_dcs();
            }
        }
        return SInstance;
    }
}
