package eu.bausov.patterns.structural.decorator;

/**
 * Created by GreenNun on 2019-03-20.
 */
public class CurrentAccount implements Account {

    @Override
    public String getTotalBenefits() {
        return "There is no withdrawal limit for current account";
    }
}
