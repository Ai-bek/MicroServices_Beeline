package kg.beeline.microservice.wallet.repository;

import kg.beeline.microservice.wallet.model.Wallet_Model;

public interface WalletRepository {
    Wallet_Model findByName(String name);
}
