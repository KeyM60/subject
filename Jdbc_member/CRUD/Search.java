package day16.jdbcEx.CRUD;

import static day16.jdbcEx.Connection.Jdbc_conn.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Search {

  public static void memberSearch() {
    String query = "select * from member";
    PreparedStatement pstmt = null;
    try {
      pstmt = connection().prepareStatement(query);
      ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
          int id = rs.getInt("id");
          String name = rs.getString("name");
          String job = rs.getString("job");
          System.out.printf("id : %d name : %s  job : %s%n", id, name, job);
        }
        pstmt.close();
        connection().close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
