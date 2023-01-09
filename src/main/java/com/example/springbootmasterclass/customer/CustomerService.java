package com.example.springbootmasterclass.customer;

import com.example.springbootmasterclass.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo repo;

    public CustomerService(@Qualifier("fake-repository") CustomerRepo repo) {
        this.repo = repo;
    }

    public List<Customer> getCustomers() {
        return repo.getCustomers();
    }

    public Customer getCustomer(long customerId) {
        return repo.getCustomers()
                .stream()
                .filter(customer -> customer.id() == customerId)
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException("Customer id:  " + customerId + "  does not exist."));
    }
}
