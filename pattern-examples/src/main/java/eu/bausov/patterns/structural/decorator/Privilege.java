package eu.bausov.patterns.structural.decorator;

/**
 * Created by GreenNun on 2019-03-20.
 */
public class Privilege extends AccountDecorator {
    private Account account;

    public Privilege(Account account) {
        super();
        this.account = account;
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are" + applyOtherBenefits();
    }

    @Override
    public String applyOtherBenefits() {
        return " an accident insurance of up to $1,000 and overdraft facility of$84";
    }
}
