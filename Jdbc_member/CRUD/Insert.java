package day16.jdbcEx.CRUD;

import static day16.jdbcEx.Connection.Jdbc_conn.connection;
import day16.jdbcEx.Member.Member;
import java.sql.PreparedStatement;

public class Insert {

  public static void memberInsert(Member member) {
    String query = "insert into member values(?,?,?)";
    int result = 0;
    PreparedStatement pstmt = null;
    try {
      pstmt = connection().prepareStatement(query);
      pstmt.setInt(1, member.getId());
      pstmt.setString(2, member.getName());
      pstmt.setString(3, member.getJob());
      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("멤버 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("멤버 정보 입력이 실패하였습니다.");
      }
      pstmt.close();
      connection().close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
