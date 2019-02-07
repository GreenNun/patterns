package eu.bausov.patterns.structural.bridge;

/**
 * Created by GreenNun on 2019-02-07.
 */
public class BridgePatternMain {
    public static void main(String[] args) {
        final SwedBank swedBank = new SwedBank(new CurrentAccount());
        final Account current = swedBank.openAccount();
        current.accountType();

        final UhisBank uhisBank = new UhisBank(new SavingAccount());
        final Account saving = uhisBank.openAccount();
        saving.accountType();
    }
}
