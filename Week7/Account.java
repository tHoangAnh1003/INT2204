import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    public Account() {
        this.balance = 0;
        transitionList = new ArrayList<>();
    }


    /**
     * Nap tien.
     * @param amount double.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            Transaction transaction = new Transaction(Transaction.DEPOSIT, amount, balance);
            transitionList.add(transaction);
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }


    /**
     * Rut tien.
     * @param amount double.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance = balance - amount;
            Transaction transaction = new Transaction(Transaction.WITHDRAW, amount, balance);
            transitionList.add(transaction);
        }
    }

    /**
     * Them vao danh sach.
     * @param amount double.
     * @param operation String.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equalsIgnoreCase("deposit")) {
            deposit(amount);
        } else if (operation.equalsIgnoreCase("withdraw")) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * In ra danh sach.
     */
    public void printTransaction() {
        for (int index = 0; index < transitionList.size(); ++index) {
            Transaction transaction = transitionList.get(index);
            double amountValue = Math.round(transaction.getAmount() * 100.0) / 100.0;
            double balanceValue = Math.round(transaction.getBalance() * 100.0) / 100.0;

            if (transaction.getOperation().equalsIgnoreCase("deposit")) {
                System.out.printf("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.\n",
                        (index + 1), amountValue, balanceValue);
            } else {
                System.out.printf("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.\n",
                        (index + 1), amountValue, balanceValue);
            }
        }
    }

}
