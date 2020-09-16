import java.math.BigDecimal;

public class TransactionServiceImpl implements TransactionService {
    private TransactionWrapper transactionWrapper;
    public TransactionServiceImpl(TransactionWrapper transactionWrapper) {
        this.transactionWrapper = transactionWrapper;
    }

    @Override
    public BigDecimal checkIncome() {
        return null;
    }
}
