public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;


    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private String getTransactionTypeString(int type) {
        return "";
    }

    public String getTransactionSummary() {
        return null;
    }

    public void addTransaction(Transaction transaction) {

    }

    public boolean equals(Object obj) {
        return true;
    }

}
