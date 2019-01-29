package eu.bausov.patterns.creational.abstractfactory;

import eu.bausov.patterns.creational.factory.Account;

/**
 * Created by GreenNun on 2019-01-29.
 */
public abstract class AbstractFactory {
    abstract Bank getBank(String bankName);

    abstract Account getAccount(String accountType);
}
