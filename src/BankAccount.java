import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountDetails {
    private List<Transaction> transactions;
    private LocalDate created;
    private String accountOwner;

    public BankAccount(String accountOwner) {
        this.transactions = new ArrayList<>();
        this.created = LocalDate.now();
        this.accountOwner = accountOwner;
    }

    public String getAccountOwner() {
        return accountOwner;
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
