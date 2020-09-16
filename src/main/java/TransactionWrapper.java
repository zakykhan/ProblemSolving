import java.util.List;

public class TransactionWrapper {

    private List<Transaction> transactions;

    public TransactionWrapper(String file) {
        Transaction transaction = new Transaction();
        this.transactions = transaction.populateData(file);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}



  