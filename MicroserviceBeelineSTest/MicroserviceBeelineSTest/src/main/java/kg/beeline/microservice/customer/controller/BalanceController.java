package kg.beeline.microservice.customer.controller;

import kg.beeline.microservice.customer.dto.BalanceReplenishmentRequestDto;
import kg.beeline.microservice.customer.service.BalanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/balance")
public class BalanceController {

    private final BalanceService balanceService;

    public BalanceController(BalanceService balanceService) {
        this.balanceService = balanceService;
    }


    @PostMapping("/replenishment")
    public ResponseEntity<?> replenishment(@RequestBody BalanceReplenishmentRequestDto replenishmentRequestDto) {

        balanceService.replenishment(replenishmentRequestDto);

        return ResponseEntity.ok("Balance replenishment");
    }
}
