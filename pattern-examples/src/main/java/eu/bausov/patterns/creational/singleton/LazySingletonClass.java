package eu.bausov.patterns.creational.singleton;

/**
 * Created by GreenNun on 2019-01-30.
 */
public class LazySingletonClass {
    private static LazySingletonClass INSTANCE = null;

    private LazySingletonClass() {
    }

    public static LazySingletonClass getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingletonClass.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingletonClass();
                }
            }
        }
        return INSTANCE;
    }
}
