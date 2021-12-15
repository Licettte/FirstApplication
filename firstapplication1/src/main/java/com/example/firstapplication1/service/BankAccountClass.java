package com.example.firstapplication1.service;

import com.example.firstapplication1.model.BankAccount;
import com.example.firstapplication1.model.Kind;
import java.io.File;
import java.util.Random;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class BankAccountClass implements BankAccountCreator {

  static final String manNames = "D:\\lp2\\NamesForBankAccounts\\MansNames.txt";
  static final String manPatronymics = "D:\\lp2\\NamesForBankAccounts\\MansPatronymics.txt";
  static final String manSurnames = "D:\\lp2\\NamesForBankAccounts\\MansSurnames.txt";

  static final String womansNames = "D:\\lp2\\NamesForBankAccounts\\WomansNames.txt";
  static final String womansPatronymics = "D:\\lp2\\NamesForBankAccounts\\WomansPatronymics.txt";
  static final String womansSurnames = "D:\\lp2\\NamesForBankAccounts\\WomansSurnames.txt";

  private final Reader namesReader;

  public BankAccount bankAccount(Kind kind) throws Exception {
    BankAccount bankAccount = new BankAccount();
    if (kind == Kind.ANY) {
      kind = Kind.generateRandomKind();
    }
    if (kind == Kind.MALE) {
      bankAccount.setFirstName(namesReader.reader(new File(manNames)));
      bankAccount.setLastName(namesReader.reader(new File(manSurnames)));
      bankAccount.setPatronymic(namesReader.reader(new File(manPatronymics)));
      bankAccount.setAccountNumber(new Random().nextLong());
      bankAccount.setUuid(UUID.randomUUID());
      bankAccount.setKind(kind);
    }
    if (kind == Kind.FEMALE) {
      bankAccount.setKind(kind);
      bankAccount.setFirstName(namesReader.reader(new File(womansNames)));
      bankAccount.setLastName(namesReader.reader(new File(womansSurnames)));
      bankAccount.setPatronymic(namesReader.reader(new File(womansPatronymics)));
      bankAccount.setAccountNumber(new Random().nextLong());
      bankAccount.setUuid(UUID.randomUUID());
    }
    return bankAccount;
  }
}