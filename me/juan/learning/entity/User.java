package me.juan.learning.entity;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class User {

    @Getter
    @ToString.Exclude
    private static final List<User> users = new ArrayList<>();
    private final List<Account> accounts = new ArrayList<>();
    private String name;

    public User(String name) {
        this.name = name;
        users.add(this);
    }
}
