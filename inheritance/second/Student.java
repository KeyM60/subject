package subject.inheritance.second;

public class Student {

  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public int getFee() {
    return fee;
  }

  public void setFee(int fee) {
    this.fee = fee;
  }

  public double getReturnFee() {
    return returnFee;
  }

  public void setReturnFee(double returnFee) {
    this.returnFee = returnFee;
  }

  public Student(String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public void calcReturnFee() {
    if (getSubject().equals("javaprogram")) {
      setReturnFee((double) getFee() * 0.25);
      System.out.printf(" 환급금은 %.0f 입니다.", returnFee);
    } else if (getSubject().equals("jspprogram")) {
      setReturnFee((double) getFee() * 0.20);
      System.out.printf(" 환급금은 %.0f 입니다.", returnFee);
    } else {
      System.out.println("그런 과정명은 없습니다.");
    }
  }

  public void print() {
    System.out.print(
        getName() + " 씨의 과정명은 " + getSubject() + " 이고 교육비는 " + getFee());
  }

  public static void main(String args[]) {
    Student stu = new Student("차은우", "jspprogram",
        500000);
    stu.print();
    stu.calcReturnFee();
  }
}
