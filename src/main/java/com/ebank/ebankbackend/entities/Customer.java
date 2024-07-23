package com.ebank.ebankbackend.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String fullName;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccounts;
}
