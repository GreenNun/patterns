package eu.bausov.patterns.creational.builder;

/**
 * Created by GreenNun on 2019-02-05.
 */
public class Account {
    private String accountName;
    private Long accountNumber;
    private String accountHolder;
    private double balance;
    private String type;
    private double interest;

    public Account(AccountBuilder builder) {
        super();
        this.accountName = builder.accountName;
        this.accountNumber = builder.accountNumber;
        this.accountHolder = builder.accountHolder;
        this.balance = builder.balance;
        this.type = builder.type;
        this.interest = builder.interest;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", interest=" + interest +
                '}';
    }

    public static class AccountBuilder {
        private String accountName;
        private Long accountNumber;
        private String accountHolder;
        private double balance;
        private String type;
        private double interest;

        public AccountBuilder(String accountName, Long accountNumber, String accountHolder) {
            this.accountName = accountName;
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
        }

        public AccountBuilder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public AccountBuilder type(String type) {
            this.type = type;
            return this;
        }

        public AccountBuilder interest(double interest) {
            this.interest = interest;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
