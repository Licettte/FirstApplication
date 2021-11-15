package com.example.firstapplication1.service;

import com.example.firstapplication1.model.BankAccount;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class Reader implements NamesReader {

  private BankAccount bankAccount;


  @Override
  public String reader(File file) throws IOException {

    List<String> lines;

      lines = Files.readAllLines(Paths.get(String.valueOf(file)));

    Random random = new Random();
    String nameMale = lines.get(random.nextInt(lines.size()));

    return nameMale;


  }}




