package kg.beeline.microservice.wallet.repository.impl;

import kg.beeline.microservice.customer.exception.CustomerNotFoundException;
import kg.beeline.microservice.customer.model.CustomerModel;
import kg.beeline.microservice.customer.model.PhoneNumberModel;
import kg.beeline.microservice.wallet.exception.WalletNotFoundException;
import kg.beeline.microservice.wallet.model.Wallet_Model;
import kg.beeline.microservice.wallet.repository.WalletRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class WalletRepositoryImpl implements WalletRepository {

    List<Wallet_Model> data;

    public WalletRepositoryImpl() {
        data = new ArrayList<>();

        Wallet_Model wallet = new Wallet_Model("Aselia","Azimkanova",100);
        data.add(wallet);

    }

    @Override
    public Wallet_Model findByName(String name) {
        for(Wallet_Model item : data){
            if(item.getName().equals(name)){
                return item;
            }
        }
        throw new WalletNotFoundException(name);
    }
}
