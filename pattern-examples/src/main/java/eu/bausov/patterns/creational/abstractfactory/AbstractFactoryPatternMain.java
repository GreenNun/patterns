package eu.bausov.patterns.creational.abstractfactory;

import eu.bausov.patterns.creational.factory.Account;

/**
 * Created by GreenNun on 2019-01-29.
 */
public class AbstractFactoryPatternMain {
    public static void main(String[] args) {
        final AbstractFactory bankFactory = FactoryProducer.getFactory("BANK");
        final Bank swedbank = bankFactory.getBank("SWEDBANK");
        swedbank.bankName();

        final Bank uhisbank = bankFactory.getBank("UHISBANK");
        uhisbank.bankName();

        final AbstractFactory accountFactory = FactoryProducer.getFactory("ACCOUNT");
        final Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType();

        final Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType();
    }
}
