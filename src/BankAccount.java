import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountDetails {
    private List<Transaction> transactions;
    private LocalDate created;

    public BankAccount() {
        this.transactions = new ArrayList<>();
        this.created = LocalDate.now();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public void printTransactions() {
        transactions.forEach(System.out::println);
    }
}
