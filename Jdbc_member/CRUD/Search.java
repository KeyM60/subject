package day16.jdbcEx.CRUD;

import day16.jdbcEx.Connection.Jdbc_conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Search extends Jdbc_conn {

  public static void memberSearch() {
    String query = "select * from member";
    PreparedStatement pstmt = null;
    try {
      pstmt = Jdbc_conn.connection().prepareStatement(query);
      ResultSet rs = pstmt.executeQuery();
      if (!rs.next()) {
        System.out.println("멤버 조회가 되지않습니다.");
      } else {
        while (rs.next()) {
          int id = rs.getInt("id");
          String name = rs.getString("name");
          String job = rs.getString("job");
          System.out.printf("id : %d name : %s  job : %s%n", id, name, job);
        }
        pstmt.close();
        Jdbc_conn.connection().close();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}