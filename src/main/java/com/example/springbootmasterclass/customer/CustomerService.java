package com.example.springbootmasterclass.customer;

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

}
