package com.example.springbootmasterclass.customer;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;


@Repository(value = "fake-repository")
public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Collections.singletonList(new Customer(1L, "James Bond"));
    }
}
