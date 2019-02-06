package eu.bausov.patterns.structural.adapter;

import eu.bausov.patterns.creational.factory.CurrentAccount;

/**
 * Created by GreenNun on 2019-02-06.
 */
public class AdvancedPayGatewayAdapter implements AdvancedPayGateway {
    private final PaymentGateway paymentGateway;

    public AdvancedPayGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String mobile1, String mobile2) {
        // getting accounts
        final CurrentAccount account1 = null;
        final CurrentAccount account2 = null;

        paymentGateway.doPayment(account1, account2);
    }
}
