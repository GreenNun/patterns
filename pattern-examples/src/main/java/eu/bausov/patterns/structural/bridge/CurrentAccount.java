package eu.bausov.patterns.structural.bridge;

/**
 * Created by GreenNun on 2019-02-07.
 */
public class CurrentAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("OPENED: CURRENT ACCOUNT");
        return new CurrentAccount();
    }

    @Override
    public void accountType() {
        System.out.println("## It's a CURRENT ACCOUNT ##");
    }
}
