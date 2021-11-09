package com.example.firstapplication1.model;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class BankAccount {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String patronymic;
    private long accountNumber;
    private Kind kind;


}


