package com.exercises.modules.fourteen;

import com.exercises.modules.fourteen.infra.http.controller.CustomerController;

import java.util.Scanner;

public class App {

  private final CustomerController controller = new CustomerController();

  public static void main(String[] args) {
    System.out.println("Welcome to Customer management v1");
    System.out.println("Select one of the options below:");
    System.out.println("1 - Create new Customer");
    System.out.println("2 - Retrieve single Customer");
    System.out.println("3 - Retrieve all Customers");
    System.out.println("4 - Update target Customer");
    System.out.println("5 - Delete target Customer");
    System.out.println("6 - Exit");

    Scanner s = new Scanner(System.in);
  }


}
