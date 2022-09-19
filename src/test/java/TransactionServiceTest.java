import org.junit.Test;

public class TransactionServiceTest {

    private TransactionService transactionService;

    @Test
    public void checkIncome() {
        TransactionWrapper transactionWrapper = new TransactionWrapper("src/main/resources/data");
        transactionService = new TransactionServiceImpl();
        transactionService.checkIncome();

    }
}
