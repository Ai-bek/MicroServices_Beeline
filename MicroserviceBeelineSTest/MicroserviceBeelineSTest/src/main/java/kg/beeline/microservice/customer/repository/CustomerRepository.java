package kg.beeline.microservice.customer.repository;

import kg.beeline.microservice.customer.model.CustomerModel;

public interface CustomerRepository {
    CustomerModel findById(Long id);
}
