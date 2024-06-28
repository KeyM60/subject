package subject.inheritance3;

public class CheckingAccount extends Account {

  private String cardNo;

  public CheckingAccount() {
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
    super(accId, balance, ownerName);
    setCardNo(cardNo);
    System.out.println("계좌 ID : " + getAccId());
    System.out.println("현재 잔액 : " + getBalance());
    System.out.println("고객명 : " + getOwnerName());
    System.out.println("카드번호 : " + getCardNo());

  }

  public void pay(long amount, String cardNo) {
    if (!getCardNo().equals(cardNo)) {
      System.out.println("올바른 카드번호가 아닙니다.");
    } else {
      if (getBalance() - Math.abs(amount) >= 0) {
        System.out.println("현재 잔액 => " + getBalance());
        deposit(amount);
        System.out.println("거래대금 : " + amount);
        System.out.println("거래 후 잔액 => " + getBalance());
      } else {
        System.out.println(amount + " 지불이 불가능합니다.");
        System.out.println("현재 잔액 => " + getBalance());
      }
    }
  }


  @Override
  public void calcRate() {
    setBalance(getBalance() / 2);

  }
}
