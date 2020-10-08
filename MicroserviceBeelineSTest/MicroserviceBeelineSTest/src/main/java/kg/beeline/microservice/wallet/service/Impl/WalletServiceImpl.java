package kg.beeline.microservice.wallet.service.Impl;


import kg.beeline.microservice.wallet.model.Wallet_Model;
import kg.beeline.microservice.wallet.repository.WalletRepository;
import kg.beeline.microservice.wallet.service.WalletService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    private final WalletRepository repository;

    public WalletServiceImpl(WalletRepository repository) {
        this.repository = repository;
    }



    public Wallet_Model getByName(@NonNull String name) {
        return repository.findByName(name);
    }
}
