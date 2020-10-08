package kg.beeline.microservice.customer.service.impl;

import kg.beeline.microservice.customer.model.CustomerModel;
import kg.beeline.microservice.customer.repository.CustomerRepository;
import kg.beeline.microservice.customer.service.CustomerService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public CustomerModel getById(@NonNull Long id) {
        return repository.findById(id);
    }
}
