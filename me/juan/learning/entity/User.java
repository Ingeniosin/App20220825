package me.juan.learning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
public class User {

    private String name;
    private final List<Account> accounts = new ArrayList<>();

}
