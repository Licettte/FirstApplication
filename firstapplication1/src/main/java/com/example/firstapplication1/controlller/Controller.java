package com.example.firstapplication1.controlller;

import com.example.firstapplication1.model.BankAccount;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Value("${url}")
  String URL;

  @GetMapping("/getAccount")
  public BankAccount bankAccount() {
    BankAccount bankAccount = new BankAccount();
    bankAccount.setAccountNumber(123);
    bankAccount.setFirstName("Маша");
    bankAccount.setLastName("Кляйн");
    bankAccount.setPatronymic("Сергеевна");
    bankAccount.setUuid(UUID.randomUUID());
    System.out.println(URL);
    return bankAccount;
  }
}
