package com.ebank.ebankbackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("SAV")
public class SavingAccount {
    private double interestRate;
}
