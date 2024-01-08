package com.example.msprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    System.out.println("Hola mundo rama team");
    System.out.println("Hola mundo rama master");
    String hola = new String("Hola");
    String mundo = new String("Mundo");
    SpringApplication.run(Application.class, args);
  }
}
