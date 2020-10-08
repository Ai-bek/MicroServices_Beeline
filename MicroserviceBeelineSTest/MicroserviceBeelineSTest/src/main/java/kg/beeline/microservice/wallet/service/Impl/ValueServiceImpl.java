package kg.beeline.microservice.wallet.service.Impl;

import kg.beeline.microservice.wallet.dto.ValueReplenishmentRequestDto;
import kg.beeline.microservice.wallet.exception.ValueReplenishmentProcessException;
import kg.beeline.microservice.wallet.model.Wallet_Model;
import kg.beeline.microservice.wallet.service.ValueService;
import kg.beeline.microservice.wallet.service.WalletService;

public class ValueServiceImpl  implements ValueService {
    private final WalletService walletService;


    public ValueServiceImpl(WalletService walletService){
        this.walletService = walletService;
    }


    @Override
    public void replenishment(ValueReplenishmentRequestDto replenishmentRequestDto) {
        try{
            Wallet_Model wallet = walletService.getByName(replenishmentRequestDto.getName());
            wallet.getName();
        } catch (Exception exception){
            throw new ValueReplenishmentProcessException();
        }

    }
}
