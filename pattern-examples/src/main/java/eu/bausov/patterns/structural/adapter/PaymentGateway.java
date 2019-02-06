package eu.bausov.patterns.structural.adapter;

import eu.bausov.patterns.creational.factory.CurrentAccount;

/**
 * Created by GreenNun on 2019-02-06.
 */
public interface PaymentGateway {
    void doPayment(CurrentAccount account1, CurrentAccount account2);
}
