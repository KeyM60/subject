package day16.jdbcEx;

import static day16.jdbcEx.CRUD.Delete.memberDelete;
import static day16.jdbcEx.CRUD.Update.memberUpdate;
import static day16.jdbcEx.CRUD.Insert.memberInsert;
import static day16.jdbcEx.CRUD.Search.memberSearch;

import java.util.Scanner;
import day16.jdbcEx.Member.Member;

public class JdbcEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("==회원 정보 입력 후 조회==");
    System.out.print("아이디 번호 : ");
    int id = Integer.parseInt(sc.nextLine());
    System.out.print("이름 : ");
    String name = sc.nextLine();
    System.out.print("직업 : ");
    String job = sc.nextLine();
    System.out.println();

    Member insert_mem = new Member(id, name, job);
    memberInsert(insert_mem);
    memberSearch();

    System.out.println("==회원 정보 수정 후 조회==");
    System.out.print("수정할 아이디 번호 : ");
    id = Integer.parseInt(sc.nextLine());
    System.out.print("\n 변경된 직업 : ");
    job = sc.nextLine();

    memberUpdate(id, job);
    memberSearch();

    System.out.println("==회원 정보삭제 후 조회==");
    System.out.print("삭제할 아이디 번호 : ");
    id = Integer.parseInt(sc.nextLine());

    memberDelete(id);
    memberSearch();
  }
}
