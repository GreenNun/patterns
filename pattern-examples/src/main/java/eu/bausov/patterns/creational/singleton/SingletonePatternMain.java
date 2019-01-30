package eu.bausov.patterns.creational.singleton;

/**
 * Created by GreenNun on 2019-01-30.
 */
public class SingletonePatternMain {
    public static void main(String[] args) {
        final EagleSingletonClass eagleSingletonClass0 = EagleSingletonClass.getInstance();
        final EagleSingletonClass eagleSingletonClass1 = EagleSingletonClass.getInstance();

        System.out.println(eagleSingletonClass0);
        System.out.println(eagleSingletonClass1);
        assert eagleSingletonClass0 == eagleSingletonClass1;
        assert eagleSingletonClass0.equals(eagleSingletonClass1);

        final LazySingletonClass lazySingletonClass0 = LazySingletonClass.getInstance();
        final LazySingletonClass lazySingletonClass1 = LazySingletonClass.getInstance();

        System.out.println(lazySingletonClass0);
        System.out.println(lazySingletonClass1);
        assert lazySingletonClass0 == lazySingletonClass1;
        assert lazySingletonClass0.equals(lazySingletonClass1);
    }
}
