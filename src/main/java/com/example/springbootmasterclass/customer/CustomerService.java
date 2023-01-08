package com.example.springbootmasterclass.customer;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CustomerService {

    public String getCustomerById(long id) {
        return getDb().get(id);
    }

    private Map<Long, String> getDb() {
        return Map.ofEntries(
                Map.entry(1L, "James Bond")
        );
    }

}
