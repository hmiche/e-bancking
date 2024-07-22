package com.ebank.ebankbackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class Customer {

    @Id
    private  Long id;
    private String fullName;
    private String email;
    private List<BankAccount> bankAccounts;
}
