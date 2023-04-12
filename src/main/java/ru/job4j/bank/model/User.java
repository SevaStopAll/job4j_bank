package ru.job4j.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User extends Id {
    @EqualsAndHashCode.Include
    private String passport;
    @EqualsAndHashCode.Include
    private String username;

    private List<Account> accounts = new CopyOnWriteArrayList<>();

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }



}