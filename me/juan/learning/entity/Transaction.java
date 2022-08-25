package me.juan.learning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
public class Transaction {

    private final Date date = new Date();
    private final List<History> histories = new ArrayList<>(List.of(
            new History("Transaction created", "Transaction created successfully")
    ));

    private Account account;
    private double amount;

}
