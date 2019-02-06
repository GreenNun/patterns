package eu.bausov.patterns.structural.adapter;

import eu.bausov.patterns.creational.factory.CurrentAccount;

/**
 * Created by GreenNun on 2019-02-06.
 */
public class PaymentGatewayImpl implements PaymentGateway {
    @Override
    public void doPayment(CurrentAccount account1, CurrentAccount account2) {
        System.out.println("Do payment using Payment Gateway");
    }
}
