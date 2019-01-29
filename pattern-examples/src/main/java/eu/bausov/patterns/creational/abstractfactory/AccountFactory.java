package eu.bausov.patterns.creational.abstractfactory;

import eu.bausov.patterns.creational.factory.Account;
import eu.bausov.patterns.creational.factory.CurrentAccount;
import eu.bausov.patterns.creational.factory.SavingAccount;

/**
 * Created by GreenNun on 2019-01-29.
 */
public class AccountFactory extends AbstractFactory {
    private final String CURRENT_ACCOUNT = "CURRENT";
    private final String SAVING_ACCOUNT = "SAVING";

    Bank getBank(String bankName) {
        return null;
    }

    public Account getAccount(String accountType) {
        if (CURRENT_ACCOUNT.equals(accountType)) {
            return new CurrentAccount();
        } else if (SAVING_ACCOUNT.equals(accountType)) {
            return new SavingAccount();
        }
        return null;
    }
}
