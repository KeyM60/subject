package subject.polymorphism.test4;

public abstract class Content {

  private String title;
  private int price;

  public Content() {
  }

  public Content(String title) {
    this.title = title;
  }

  abstract void totalPrice();

  void show() {
    System.out.println(getTitle() + " 비디오의 가격은 " + getPrice() + " 원 입니다.");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
