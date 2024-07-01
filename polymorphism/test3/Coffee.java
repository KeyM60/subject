package subject.polymorphism.test3;

public class Coffee extends Beverage {

  static int amount;

  public Coffee(String name) {
    super(name);
    amount++;
    calcPrice();
  }

  @Override
  void calcPrice() {
    switch (getName()) {
      case "Americano" -> setPrice(1500);
      case "CafeLatte" -> setPrice(2500);
      case "Cappuccino" -> setPrice(3000);
    }
  }
}
