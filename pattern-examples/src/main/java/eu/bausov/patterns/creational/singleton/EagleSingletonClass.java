package eu.bausov.patterns.creational.singleton;

/**
 * Created by GreenNun on 2019-01-30.
 */
public class EagleSingletonClass {
    private static EagleSingletonClass INSTANCE = new EagleSingletonClass();

    private EagleSingletonClass() {
    }

    public static EagleSingletonClass getInstance() {
        return INSTANCE;
    }
}
