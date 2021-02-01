public abstract class Transaction {
    private int amount;

    public Transaction(int amount) {
        this.amount = amount;
    }

    public abstract String transactionType();

    @Override
    public String toString() {
        return transactionType() + ":" + amount;
    }
}
