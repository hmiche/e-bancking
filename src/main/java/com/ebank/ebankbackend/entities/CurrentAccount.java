package com.ebank.ebankbackend.entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("CUR")
public class CurrentAccount extends BankAccount{
    private double overdraftLimit;
}
