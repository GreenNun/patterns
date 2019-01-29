package eu.bausov.patterns.creational.factory;

/**
 * Created by GreenNun on 2019-01-29.
 */
public class FactoryPatternMain {
    public static void main(String[] args) {
        final AccountFactory accountFactory = new AccountFactory();

        final Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType();

        final Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType();
    }
}
