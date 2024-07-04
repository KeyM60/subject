package day16.jdbcEx.CRUD;

import static day16.jdbcEx.Connection.Jdbc_conn.connection;
import java.sql.PreparedStatement;

public class Update {

  public static void memberUpdate(int id, String job) {
    String query = "UPDATE member SET job = ? where id = ? ";
    int result = 0;
    PreparedStatement pstmt = null;
    try {
      pstmt = Jdbc_conn.connection().prepareStatement(query);
      pstmt.setString(1, job);
      pstmt.setInt(2, id);
      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("멤버 정보가 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("멤버 정보 수정은 실패하였습니다.");
      }
      pstmt.close();
      Jdbc_conn.connection().close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
