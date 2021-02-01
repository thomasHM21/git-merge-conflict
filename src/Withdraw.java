public class Withdraw extends Transaction {
    public Withdraw(int amount) {
        super(amount);
    }

    @Override
    public String transactionType() {
        return "WITHDRAW";
    }
}
