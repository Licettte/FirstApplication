package com.example.firstapplication1.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class Reader implements NamesReader {

  @Override
  public String reader(File file) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(String.valueOf(file)));
    return lines.get(new Random().nextInt(lines.size()));
  }
}