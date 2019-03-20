package eu.bausov.patterns.structural.decorator;

/**
 * Created by GreenNun on 2019-03-20.
 */
public class DecoratorPatternMain {

    public static void main(String[] args) {
        final Account basicAccount = new SavingAccount();
        System.out.println(basicAccount.getTotalBenefits());

        Account seniorCitizenSavingAccount = new SavingAccount();
        seniorCitizenSavingAccount = new SeniorCitizen(seniorCitizenSavingAccount);
        System.out.println(seniorCitizenSavingAccount.getTotalBenefits());

        Account privilegeCitizenSavingAccount = new SavingAccount();
        privilegeCitizenSavingAccount = new Privilege(privilegeCitizenSavingAccount);
        System.out.println(privilegeCitizenSavingAccount.getTotalBenefits());
    }
}
