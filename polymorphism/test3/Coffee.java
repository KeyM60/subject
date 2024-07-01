package subject.polymorphism.test3;

public class Coffee extends Beverage {

  static int amount;

  public Coffee(String name) {
    super(name);
    this.amount += 1;
    calcPrice();
  }

  @Override
  void calcPrice() {
    if (getName().equals("Americano")) {
      setPrice(1500);
    } else if (getName().equals("CafeLatte")) {
      setPrice(2500);
    } else if (getName().equals("Cappuccino")) {
      setPrice(3000);
    }
  }
}
