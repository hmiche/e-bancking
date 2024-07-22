package com.ebank.ebankbackend.entities;

import lombok.Data;

@Data
public class CurrentAccount extends BankAccount{
    private double overdraftLimit;
}
