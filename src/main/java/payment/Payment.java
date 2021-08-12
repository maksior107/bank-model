package payment;

import java.time.LocalDate;
import java.util.Objects;

public class Payment {
    private String id;
    private String key;
    private double amount;
    private LocalDate date;

    public Payment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return getId() == payment.getId() && Double.compare(payment.getAmount(), getAmount()) == 0 && Objects.equals(getKey(), payment.getKey()) && Objects.equals(getDate(), payment.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getKey(), getAmount(), getDate());
    }
}
