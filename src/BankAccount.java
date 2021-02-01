import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountDetails {
    private List<Transaction> transactions;
    private String accountOwner;

    public BankAccount() {
        this.transactions = new ArrayList<>();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public void printTransactions() {
        transactions.forEach(System.out::println);
    }
}
