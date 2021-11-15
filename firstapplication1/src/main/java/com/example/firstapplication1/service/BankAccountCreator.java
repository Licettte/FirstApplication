package com.example.firstapplication1.service;

import com.example.firstapplication1.model.BankAccount;
import com.example.firstapplication1.model.Kind;
import java.io.IOException;


public interface BankAccountCreator {

  BankAccount bankAccount(Kind kind) throws  Exception;

}
