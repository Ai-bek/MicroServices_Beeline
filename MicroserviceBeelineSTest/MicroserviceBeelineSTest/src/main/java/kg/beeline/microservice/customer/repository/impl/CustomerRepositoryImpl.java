package kg.beeline.microservice.customer.repository.impl;

import kg.beeline.microservice.customer.exception.CustomerNotFoundException;
import kg.beeline.microservice.customer.model.CustomerModel;
import kg.beeline.microservice.customer.model.PhoneNumberModel;
import kg.beeline.microservice.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerRepositoryImpl implements CustomerRepository {
    List<CustomerModel> data;

    public CustomerRepositoryImpl() {
        data = new ArrayList<>();

        PhoneNumberModel phoneNumber1 = new PhoneNumberModel(1L, "+996775083872", BigDecimal.valueOf(100L));
        CustomerModel customer = new CustomerModel(1L, "Aselia", "Azimkanova", phoneNumber1);
        data.add(customer);
    }


    @Override
    public CustomerModel findById(Long id) {
        for (CustomerModel item : data) {
            if (item.getId().equals(id)) {
                return item;
            }
        }

        throw new CustomerNotFoundException(id);
    }
}
