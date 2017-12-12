package test.towteefourdesignmode;

/**
 * Created by Administrator on 2017/12/12.
 */

public class SingleMode_LangHan {
    private static SingleMode_LangHan SInstance;

    private SingleMode_LangHan() {
    }

    public static synchronized SingleMode_LangHan getInstance() {
        if (SInstance == null) {
            SInstance = new SingleMode_LangHan();
        }
        return SInstance;
    }
}
