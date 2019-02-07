package eu.bausov.patterns.structural.bridge;

/**
 * Created by GreenNun on 2019-02-07.
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("OPENED: SAVING ACCOUNT");
        return new SavingAccount();
    }

    @Override
    public void accountType() {
        System.out.println("## It's a SAVING ACCOUNT ##");
    }
}
