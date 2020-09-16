import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TransactionTest {


    @Test
    public void testTransactionPopulation() {
        Transaction translation = new Transaction();
        assertNotNull(translation.populateData("src/main/resources/data"));
    }

    @Test
    public void testCheckTransactionCount() {
        Transaction translation = new Transaction();
        List<Transaction> transactions = translation.populateData("src/main/resources/data");
        assertEquals(transactions.size(),9);
    }
}
