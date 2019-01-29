package eu.bausov.patterns.creational.abstractfactory;

/**
 * Created by GreenNun on 2019-01-29.
 */
public class FactoryProducer {
    private final static String BANK = "BANK";
    private final static String ACCOUNT = "ACCOUNT";

    public static AbstractFactory getFactory(String factory) {
        if (BANK.equals(factory)) {
            return new BankFactory();
        } else if (ACCOUNT.equals(factory)) {
            return new AccountFactory();
        }

        return null;
    }
}
