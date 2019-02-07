package eu.bausov.patterns.structural.bridge;

/**
 * Created by GreenNun on 2019-02-07.
 */
public class UhisBank extends Bank {
    protected UhisBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Open your account with UhisBank");
        return account;
    }
}
