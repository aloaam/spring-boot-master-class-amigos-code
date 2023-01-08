package com.example.springbootmasterclass.customer;

import java.util.Map;

public class CustomerRepository {

    public String getCustomerById(long id) {
        return getDb().get(id);
    }

    private Map<Long, String> getDb() {
        return Map.ofEntries(
                Map.entry(1L, "James Bond")
        );
    }
}
