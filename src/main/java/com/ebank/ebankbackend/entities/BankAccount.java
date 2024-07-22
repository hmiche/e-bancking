package com.ebank.ebankbackend.entities;

import com.ebank.ebankbackend.enums.AccountStatus;

import java.util.Date;
import java.util.List;

public class BankAccount {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private Customer customer;
    private List<AccountOperation> accountOperation;


}
