package com.example.firstapplication1.model;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {

  private UUID requestId;
  private Kind kind;

  }

