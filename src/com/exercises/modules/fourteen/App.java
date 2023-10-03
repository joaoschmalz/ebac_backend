package com.exercises.modules.fourteen;

import com.exercises.modules.fourteen.dtos.CustomerDTO;
import com.exercises.modules.fourteen.infra.http.controller.CustomerController;
import com.exercises.modules.fourteen.infra.http.views.CustomerView;
import com.exercises.modules.fourteen.infra.localDatabase.entities.Customer;

import java.util.List;
import java.util.Scanner;

import static java.util.Objects.isNull;

public class App {

  private static final CustomerController controller = new CustomerController();

  public static void main(String[] args) {

    boolean exit = false;
    while (!exit) {
      System.out.println("Welcome to Customer management v1");
      System.out.println("Select one of the options below:");
      System.out.println("1 - Create new Customer");
      System.out.println("2 - Retrieve single Customer");
      System.out.println("3 - Retrieve all Customers");
      System.out.println("4 - Update target Customer");
      System.out.println("5 - Delete target Customer");
      System.out.println("6 - Exit");
      System.out.println("-----------------------------------");

      Scanner s = new Scanner(System.in);
      int option = s.nextInt();

      switch (option) {
        case 1:
          create();
          break;
        case 2:
          retrieveSingle();
          break;
        case 3:
          retrieveAll();
          break;
        case 4:
          update();
          break;
        case 5:
          delete();
          break;
        case 6:
          System.out.println("Good bye...");
          exit = true;
          break;
        default:
          System.out.println("Invalid option");
      }
    }
  }

  private static void create(){
    controller.create(createView(true));
  }

  public static void retrieveSingle() {
    Scanner s = new Scanner(System.in);
    try {
      System.out.println("Enter customer CPF");
      String cpf = s.nextLine();
      controller.index(cpf);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("-----------------------------------");
    }
  }

  public static void retrieveAll() {
    final List<Customer> customers = controller.show();

    for (Customer c : customers) System.out.println(c);
  }

  public static void update() {
    Scanner s = new Scanner(System.in);
    try {
      System.out.println("Enter Customer CPF:");
      String cpf = s.nextLine();
      final CustomerView view = createView(false);
      view.setCpf(cpf);
      controller.update(view);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void delete() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Customer CPF");
    controller.delete(s.nextLine());
  }
  private static CustomerView createView(final boolean needCpf) {
    Scanner s = new Scanner(System.in);
    final CustomerView view = new CustomerView();
    System.out.println("Enter Customer information");

    System.out.println("Customer name:");
    view.setName(s.nextLine());
    if (needCpf) {
      System.out.println("Customer CPF:");
      view.setCpf(s.nextLine());
    }
    System.out.println("Customer phone:");
    view.setPhone(s.nextLine());
    System.out.println("Customer address:");
    view.setAddress(s.nextLine());
    System.out.println("Customer city:");
    view.setCity(s.nextLine());
    System.out.println("Customer state:");
    view.setState(s.nextLine());

    return view;
  }
}
