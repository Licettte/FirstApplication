package com.example.firstapplication1.model;

import java.util.UUID;
import lombok.Data;

@Data
public class Request {
  private UUID requestId;
  private Kind kind;
}