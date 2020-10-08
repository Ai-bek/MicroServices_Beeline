package kg.beeline.microservice.customer.controller;

import kg.beeline.microservice.customer.model.CustomerModel;
import kg.beeline.microservice.customer.service.CustomerService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //запрос данные клиента
    @GetMapping(value = "/{id}")
    public CustomerModel getById(@PathVariable @NonNull Long id) {
        return customerService.getById(id);
    }

}
