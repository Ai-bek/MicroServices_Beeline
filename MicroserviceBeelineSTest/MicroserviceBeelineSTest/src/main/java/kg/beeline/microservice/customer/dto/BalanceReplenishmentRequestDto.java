package kg.beeline.microservice.customer.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class BalanceReplenishmentRequestDto {
    @NotNull
    private Long customerId;
    @NotNull
    private BigDecimal amount;

    public BalanceReplenishmentRequestDto(@NotNull Long customerId, @NotNull BigDecimal amount) {
        this.customerId = customerId;
        this.amount = amount;
    }

    public BalanceReplenishmentRequestDto() {
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
