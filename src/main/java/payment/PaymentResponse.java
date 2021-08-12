package payment;

import java.util.List;

public class PaymentResponse {
    private List<Payment> payments;

    public PaymentResponse(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
