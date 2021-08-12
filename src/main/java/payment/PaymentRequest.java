package payment;

import java.time.LocalDate;

public class PaymentRequest {
    private String key;
    private LocalDate fromDate;

    public PaymentRequest() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }
}
