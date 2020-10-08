package kg.beeline.microservice.customer.service.impl;

import kg.beeline.microservice.customer.dto.BalanceReplenishmentRequestDto;
import kg.beeline.microservice.customer.exception.BalanceReplenishmentUnProcessException;
import kg.beeline.microservice.customer.model.CustomerModel;
import kg.beeline.microservice.customer.service.BalanceService;
import kg.beeline.microservice.customer.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class BalanceServiceImpl implements BalanceService {

    private final CustomerService customerService;

    public BalanceServiceImpl(CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    public void replenishment(BalanceReplenishmentRequestDto replenishmentRequestDto) {
        try {
            CustomerModel customer = customerService.getById(replenishmentRequestDto.getCustomerId());
            customer.getPhoneNumberModel().addBalance(replenishmentRequestDto.getAmount());
        } catch (Exception exception) {
            throw new BalanceReplenishmentUnProcessException();
        }
    }
}
