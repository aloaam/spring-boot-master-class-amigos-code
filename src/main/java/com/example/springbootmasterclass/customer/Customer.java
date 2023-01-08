package com.example.springbootmasterclass.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Customer(long id, String name) {

    @Override
    @JsonProperty("surname")
    public String name() {
        return name;
    }
}
