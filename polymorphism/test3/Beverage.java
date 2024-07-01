package subject.polymorphism.test3;

public abstract class Beverage {

  private String name;
  protected int price;


  public Beverage(String name) {
    this.name = name;
  }

  abstract void calcPrice();

  void print() {
    System.out.println("번째 판매 음료는 " + getName() + "이며, 가격은 " + getPrice());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
