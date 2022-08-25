package me.juan.learning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
@AllArgsConstructor
@ToString
public class Account {

    private final UUID uuid = UUID.randomUUID();

    @ToString.Exclude
    private User user;
    private double balance;
    private AccountStatus status;


}
