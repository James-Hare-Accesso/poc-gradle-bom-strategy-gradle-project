package com.example.multimoduleapplication;

import com.example.multimodulelibrary.service.MyService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MultiModuleApplication {

  final static MyService myService = new MyService();

  @GetMapping("/")
  public String home() {
    return myService.message();
  }

  public static void main(final String[] args) {
    while (true) {
      System.out.println(myService.message());
    }
  }

}
