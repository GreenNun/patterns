package eu.bausov.patterns.structural.composite;

import eu.bausov.patterns.creational.factory.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GreenNun on 2019-02-20.
 */
public class CompositeBankAccount implements Account {
    private List<Account> childAccounts = new ArrayList<>();

    @Override
    public void accountType() {
        for (Account account : childAccounts) {
            account.accountType();
        }
    }

    public void add(Account account) {
        childAccounts.add(account);
    }

    public void remove(Account account) {
        childAccounts.remove(account);
    }
}
