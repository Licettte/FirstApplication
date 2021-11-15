package com.example.firstapplication1.service;

import com.example.firstapplication1.model.BankAccount;
import com.example.firstapplication1.model.Kind;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;
import javax.imageio.IIOException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class BankAccountClass implements BankAccountCreator {

  static final String path = "D:\\lp2\\NamesForBankAccounts\\MansNames.txt";
  static final String path1 = "D:\\lp2\\NamesForBankAccounts\\MansPatronymics.txt";
  static final String path2 = "D:\\lp2\\NamesForBankAccounts\\MansSurnames.txt";

  static final String path3 = "D:\\lp2\\NamesForBankAccounts\\WomansNames.txt";
  static final String path4 = "D:\\lp2\\NamesForBankAccounts\\WomansPatronymics.txt";
  static final String path5 = "D:\\lp2\\NamesForBankAccounts\\WomansSurnames.txt";

  private final NamesReader namesReader;

  public BankAccount bankAccount(Kind kind) throws Exception {

    BankAccount bankAccount = new BankAccount();

    if (kind == Kind.ANY) {
      kind = Kind.generateRandomKind();
    }

    if (kind == Kind.MALE) {

      bankAccount.setFirstName(namesReader.reader(new File(path)));
      bankAccount.setLastName(namesReader.reader(new File(path2)));
      bankAccount.setPatronymic(namesReader.reader(new File(path1)));

      bankAccount.setAccountNumber(new Random().nextLong());
      bankAccount.setUuid(UUID.randomUUID());
      bankAccount.setKind(kind);

    }
    if (kind == Kind.FEMALE) {

      bankAccount.setKind(kind);

      bankAccount.setFirstName(namesReader.reader(new File(path3)));
      bankAccount.setLastName(namesReader.reader(new File(path5)));
      bankAccount.setPatronymic(namesReader.reader(new File(path4)));

      bankAccount.setAccountNumber(new Random().nextLong());
      bankAccount.setUuid(UUID.randomUUID());
    }

    return bankAccount;
  }
}







