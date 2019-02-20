package eu.bausov.patterns.structural.composite;

import eu.bausov.patterns.creational.factory.CurrentAccount;
import eu.bausov.patterns.creational.factory.SavingAccount;

/**
 * Created by GreenNun on 2019-02-20.
 */
public class CompositePatternMain {
    public static void main(String[] args) {
        final SavingAccount savingAccount1 = new SavingAccount();
        final SavingAccount savingAccount2 = new SavingAccount();

        final CurrentAccount currentAccount1 = new CurrentAccount();
        final CurrentAccount currentAccount2 = new CurrentAccount();

        final CompositeBankAccount compositeBankAccount1 = new CompositeBankAccount();
        final CompositeBankAccount compositeBankAccount2 = new CompositeBankAccount();
        final CompositeBankAccount compositeBankAccount3 = new CompositeBankAccount();

        compositeBankAccount1.add(savingAccount1);
        compositeBankAccount1.add(currentAccount1);
        compositeBankAccount2.add(savingAccount2);
        compositeBankAccount2.add(currentAccount2);

        compositeBankAccount3.add(compositeBankAccount1);
        compositeBankAccount3.add(compositeBankAccount2);

        compositeBankAccount3.accountType();
    }
}
