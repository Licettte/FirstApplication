package com.example.firstapplication1.service;

import com.example.firstapplication1.model.BankAccount;
import com.example.firstapplication1.model.Kind;


public interface BankAccountCreator {

  BankAccount bankAccount(Kind kind);

}
//  c методом принимающим kind и возвращающим BankAccount.

