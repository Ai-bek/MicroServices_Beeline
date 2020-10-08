package kg.beeline.microservice.wallet.service;

import kg.beeline.microservice.customer.dto.BalanceReplenishmentRequestDto;
import kg.beeline.microservice.wallet.dto.ValueReplenishmentRequestDto;

public interface ValueService {
    void replenishment(ValueReplenishmentRequestDto replenishmentRequestDto);
}
