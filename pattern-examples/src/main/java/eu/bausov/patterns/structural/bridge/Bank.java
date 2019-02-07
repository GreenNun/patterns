package eu.bausov.patterns.structural.bridge;

/**
 * Created by GreenNun on 2019-02-07.
 */
public abstract class Bank {
    protected final Account account;

    protected Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
