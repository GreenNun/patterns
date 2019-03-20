package eu.bausov.patterns.structural.decorator;

/**
 * Created by GreenNun on 2019-03-20.
 */
public class SavingAccount implements Account {

    @Override
    public String getTotalBenefits() {
        return "This account has 4% interest rate with per day $5000 withdrawal limit";
    }
}
