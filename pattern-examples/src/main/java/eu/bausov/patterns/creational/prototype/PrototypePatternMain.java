package eu.bausov.patterns.creational.prototype;

/**
 * Created by GreenNun on 2019-02-04.
 */
public class PrototypePatternMain {
    public static void main(String[] args) {
        Account currentAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
        currentAccount.accountType();

        Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING").clone();
        savingAccount.accountType();
    }
}
