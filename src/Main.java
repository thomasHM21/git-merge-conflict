public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.addTransaction(new Deposit(10));
        bankAccount.addTransaction(new Withdraw(10));

        bankAccount.printTransactions();
    }
}
