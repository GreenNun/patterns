package eu.bausov.patterns.creational.builder;

/**
 * Created by GreenNun on 2019-02-05.
 */
public class BuilderPatternMain {
    public static void main(String[] args) {
        final Account account = new Account.AccountBuilder("SAVING ACCOUNT", 123L, "Pruzhinkin Anatoly")
                .balance(99999)
                .interest(2.2)
                .type("SAVING")
                .build();

        System.out.println(account);
    }
}
