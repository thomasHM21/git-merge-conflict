public class Deposit extends Transaction {
    public Deposit(int amount) {
        super(amount);
    }

    @Override
    public String transactionType() {
        return "DEPOSIT";
    }
}
