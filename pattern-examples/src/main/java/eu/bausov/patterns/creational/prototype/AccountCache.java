package eu.bausov.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GreenNun on 2019-02-04.
 */
public class AccountCache {
    public static Map<String, Account> accountCacheMap = new HashMap<>();

    static {
        Account currentAccount = new CurrentAccount();
        Account savingAccount = new SavingAccount();
        accountCacheMap.put("CURRENT", currentAccount);
        accountCacheMap.put("SAVING", savingAccount);
    }
}
