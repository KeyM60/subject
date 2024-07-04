package day16.jdbcEx.CRUD;

import day16.jdbcEx.Connection.Jdbc_conn;
import java.sql.PreparedStatement;

public class Delete extends Jdbc_conn {

  public static void memberDelete(int id) {
    String query = "DELETE FROM member where id = ? ";
    int result = 0;
    PreparedStatement pstmt = null;
    try {
      pstmt = Jdbc_conn.connection().prepareStatement(query);
      pstmt.setInt(1, id);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("멤버 정보가 삭제되었습니다..");
      } else if (result == 0) {
        System.out.println("멤버 정보 삭제는 실패하였습니다.");
      }

      pstmt.close();
      Jdbc_conn.connection().close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
