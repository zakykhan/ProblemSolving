import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Transaction {
    private String date;
    private BigDecimal amount;
    private String client;

    public Transaction(String date, String amount, String client) {
        this.date = date;
        this.amount = new BigDecimal(amount);
        this.client =  client;
    }

    public Transaction() {
    }

    public List<Transaction> populateData(String file) {
        try {
            List<String> transactions = Files.readAllLines(Paths.get(file));
            return transactions.stream()
                    .map(transactionString->transactionString.split(","))
                    .filter(data->data.length == 3)
                    .map(transaction->new Transaction(transaction[0], transaction[1], transaction[2]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.EMPTY_LIST;
    }

    public String getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getClient() {
        return client;
    }
}
