package kg.beeline.microservice.wallet.controller;

import kg.beeline.microservice.wallet.model.Wallet_Model;
import kg.beeline.microservice.wallet.service.WalletService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/wallet")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @GetMapping("/{name}")
    public Wallet_Model getByName(@PathVariable String name){
        return walletService.getByName(name);
    }
}
