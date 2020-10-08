package kg.beeline.microservice.customer.service;

import kg.beeline.microservice.customer.model.CustomerModel;

public interface CustomerService {
    CustomerModel getById(Long id);
}
