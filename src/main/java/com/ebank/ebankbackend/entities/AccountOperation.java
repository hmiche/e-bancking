package com.ebank.ebankbackend.entities;

import com.ebank.ebankbackend.enums.OperationType;

import java.util.Date;

public class AccountOperation {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType  type;
    private BankAccount bankAccount;

}
