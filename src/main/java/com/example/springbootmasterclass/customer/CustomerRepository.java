package com.example.springbootmasterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;


@Repository
@Primary
public class CustomerRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Collections.singletonList(new Customer(2L, "Needs to be implemented", "to be implemented"));
    }
}
