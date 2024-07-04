package day16.jdbcEx.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Jdbc_conn {

  public static Connection connection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "thrhrl12@";

    Connection conn = null;
    conn = DriverManager.getConnection(url, userName, password);

    return conn;
  }


}
