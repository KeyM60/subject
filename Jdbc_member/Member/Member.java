package day16.jdbcEx.Member;

public class Member {

  private int id;
  private String name;
  private String job;

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getJob() {
    return job;
  }

  public Member(int id, String name, String job) {
    this.id = id;
    this.name = name;
    this.job = job;
  }

  public Member(int id, String job) {
    this.id = id;
    this.job = job;
  }

  public Member(int id) {
    this.id = id;
  }
}
