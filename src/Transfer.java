public class Transfer extends Transaction {
    public String Recipient;

    public Transfer(int amount, String recipient) {
        super(amount);
        Recipient = recipient;
    }

    @Override
    public String transactionType() {
        return "TRANSFER (" + Recipient + ")";
    }
}
