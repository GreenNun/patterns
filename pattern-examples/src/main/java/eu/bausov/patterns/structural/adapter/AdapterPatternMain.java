package eu.bausov.patterns.structural.adapter;

/**
 * Created by GreenNun on 2019-02-06.
 */
public class AdapterPatternMain {
    public static void main(String[] args) {
        final PaymentGateway paymentGateway = new PaymentGatewayImpl();
        final AdvancedPayGateway advancedPayGateway = new AdvancedPayGatewayAdapter(paymentGateway);

        final String mobile1 = null;
        final String mobile2 = null;

        advancedPayGateway.makePayment(mobile1, mobile2);
    }
}
