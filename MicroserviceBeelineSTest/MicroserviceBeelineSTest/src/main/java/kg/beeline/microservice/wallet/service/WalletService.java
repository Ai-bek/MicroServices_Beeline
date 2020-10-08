package kg.beeline.microservice.wallet.service;

import kg.beeline.microservice.wallet.model.Wallet_Model;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface WalletService {
    Wallet_Model getByName(String name);
}
