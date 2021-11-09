package com.example.firstapplication1.controlller;

import com.example.firstapplication1.model.BankAccount;
import com.example.firstapplication1.model.Request;
import com.example.firstapplication1.model.Response;
import com.example.firstapplication1.service.BankAccountCreator;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class Controller {

  // Далее в контроллере заинжектить бин BankAccountCreator
  private final BankAccountCreator bankAccountCreator;

  //конструктор

  @Value("${url}")
  String URL;

  @GetMapping("/getAccount")
  public BankAccount bankAccount() {
    BankAccount bankAccount = new BankAccount();
    return bankAccount;
  }

  @PostMapping("/getAccountByKind")
  public Response response(@RequestBody Request request) {


    Response response = new Response();

    //через него в методе при формировании Response получить BankAccount
    //   положить в поле bankAccount

// поле requestId задать из Request.requestId

    UUID requestId = request.getRequestId();

    //  поле responseId сгенерировать рандомно.
    response.setResponseId(UUID.randomUUID());
    UUID responseId = response.getResponseId();

    response.setAccount(bankAccountCreator.bankAccount(request.getKind()));
    BankAccount account = response.getAccount();
    return response;
  }
}
