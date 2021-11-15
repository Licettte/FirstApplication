package com.example.firstapplication1.controlller;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class NoSuchFileException extends Throwable {

    public NoSuchFileException(String message){
      super(message);
    }

  }

