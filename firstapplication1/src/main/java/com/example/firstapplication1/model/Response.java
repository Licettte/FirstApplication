package com.example.firstapplication1.model;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Response {

  private UUID responseId;
  private UUID requestId;
  private BankAccount account;

}

