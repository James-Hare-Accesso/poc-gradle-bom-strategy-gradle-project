package com.example.multimodulelibrary.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

  public MyService() {
  }

  public String message() {
    return "This is a message from the library.";
  }
}