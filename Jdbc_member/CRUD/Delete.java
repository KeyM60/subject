package day16.jdbcEx.CRUD;

import static day16.jdbcEx.Connection.Jdbc_conn.connection;
import java.sql.PreparedStatement;

public class Delete {

  public static void memberDelete(int id) {
    String query = "DELETE FROM member where id = ? ";
    int result = 0;
    PreparedStatement pstmt = null;
    try {
      pstmt = connection().prepareStatement(query);
      pstmt.setInt(1, id);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("멤버 정보가 삭제되었습니다..");
      } else if (result == 0) {
        System.out.println("멤버 정보 삭제는 실패하였습니다.");
      }

      pstmt.close();
      connection().close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
