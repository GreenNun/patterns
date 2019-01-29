package eu.bausov.patterns.creational.abstractfactory;

import eu.bausov.patterns.creational.factory.Account;

/**
 * Created by GreenNun on 2019-01-29.
 */
public class BankFactory extends AbstractFactory {
    private final String SWEDBANK = "SWEDBANK";
    private final String UHISBANK = "UHISBANK";

    Bank getBank(String bankName) {
        if (SWEDBANK.equals(bankName)) {
            return new SwedBank();
        } else if (UHISBANK.equals(bankName)) {
            return new UhisBank();
        }

        return null;
    }

    Account getAccount(String accountType) {
        return null;
    }
}
