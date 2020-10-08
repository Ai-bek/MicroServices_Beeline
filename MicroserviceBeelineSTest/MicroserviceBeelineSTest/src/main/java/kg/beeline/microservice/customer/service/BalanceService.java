package kg.beeline.microservice.customer.service;

import kg.beeline.microservice.customer.dto.BalanceReplenishmentRequestDto;

public interface BalanceService {
    void replenishment(BalanceReplenishmentRequestDto replenishmentRequestDto);
}
