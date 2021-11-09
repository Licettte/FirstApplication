package com.example.firstapplication1.model;
import java.util.Random;

public enum Kind  {
  MALE, FEMALE, ANY;

  public static Kind generateRandomKind() {
    Kind[] values = Kind.values();
    int length = values.length;
    int randIndex = new Random().nextInt(length);
    return values[randIndex];
  }
}

