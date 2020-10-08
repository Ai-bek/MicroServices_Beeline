package kg.beeline.microservice.wallet.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class ValueReplenishmentRequestDto {

    @NotNull
    private String name;

    @NotNull
    private BigDecimal value;

    public ValueReplenishmentRequestDto(@NotNull String name, @NotNull BigDecimal value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
