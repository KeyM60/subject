package subject.inheritance3;

public class TestAccount {

  public static void main(String[] args) {

    CheckingAccount checkingAccount = new CheckingAccount("kim_01", 1000000, "진호", "110");
    checkingAccount.pay(-10000000, "110");
    checkingAccount.pay(500000, "110");
  }
}
