package eu.bausov.patterns.structural.bridge;

/**
 * Created by GreenNun on 2019-02-07.
 */
public class SwedBank extends Bank {
    protected SwedBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Open your account with SwedBank");
        return account;
    }
}
