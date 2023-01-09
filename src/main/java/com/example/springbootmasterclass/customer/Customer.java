package com.example.springbootmasterclass.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Customer(
        @NotNull(message = "Please enter id") long id,
        @NotBlank String name,
        @NotBlank @Email String email){
}

