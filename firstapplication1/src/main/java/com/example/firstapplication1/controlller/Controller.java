package com.example.firstapplication1.controlller;

import com.example.firstapplication1.model.BankAccount;
import com.example.firstapplication1.model.Request;
import com.example.firstapplication1.model.Response;
import com.example.firstapplication1.service.BankAccountCreator;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class Controller {

  private final BankAccountCreator bankAccountCreator;

  @GetMapping("/getAccount")

  public BankAccount bankAccount() {
    BankAccount bankAccount = new BankAccount();
    return bankAccount;
  }

  @PostMapping("/getAccountByKind")

  public Response response(@RequestBody Request request) {

    Response response = new Response();
    response.setResponseId(UUID.randomUUID());
    response.setRequestId(request.getRequestId());

    try {
      response.setAccount(bankAccountCreator.bankAccount(request.getKind()));
      return response;
    } catch (Exception e) {
      e.printStackTrace();
      return response;
    }
  }
}




