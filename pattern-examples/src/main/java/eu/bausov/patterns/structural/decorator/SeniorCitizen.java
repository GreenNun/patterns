package eu.bausov.patterns.structural.decorator;

/**
 * Created by GreenNun on 2019-03-20.
 */
public class SeniorCitizen extends AccountDecorator {
    private Account account;

    public SeniorCitizen(Account account) {
        super();
        this.account = account;
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are" + applyOtherBenefits();
    }

    @Override
    String applyOtherBenefits() {
        return " an medical insurance of up to $1,000 for Senior Citizen";
    }
}
