package kg.beeline.microservice.customer.model;

import java.math.BigDecimal;
import java.util.Objects;

public class PhoneNumberModel {
    private Long id;
    private String number;
    private BigDecimal balance;

    public PhoneNumberModel() {

    }

    public PhoneNumberModel(Long id, String number, BigDecimal balance) {
        this.id = id;
        this.number = number;
        this.balance = balance;
    }

    public BigDecimal addBalance(BigDecimal amount) {
        this.balance = balance.add(amount);
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumberModel)) return false;
        PhoneNumberModel that = (PhoneNumberModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(number, that.number) &&
                Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, balance);
    }

    @Override
    public String toString() {
        return "PhoneNumberModel{" +
                "id=" + id +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
