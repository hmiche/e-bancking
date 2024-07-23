package com.ebank.ebankbackend.entities;

import com.ebank.ebankbackend.enums.OperationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@Entity
public class AccountOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType  type;
    @ManyToOne
    private BankAccount bankAccount;

}
