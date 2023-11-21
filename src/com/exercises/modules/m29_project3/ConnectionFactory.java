package com.exercises.modules.m29_project3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.util.Objects.isNull;

public class ConnectionFactory {

  private static Connection connection;

  private ConnectionFactory(final Connection connection) {

  }

  public static Connection getConnection() {
    if (isNull(connection)) connection = initConnection();
    return connection;
  }

  private static Connection initConnection() {
    try {
      return DriverManager.getConnection("jdbc:postgresql://localhost:15432/ebac_p3", "postgres", "895623");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
