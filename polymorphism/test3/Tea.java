package subject.polymorphism.test3;

public class Tea extends Beverage {

  static int amount;

  public Tea(String name) {
    super(name);
    amount++;
    calcPrice();
  }

  @Override
  void calcPrice() {
    switch (getName()) {
      case "lemonTea" -> setPrice(1500);
      case "ginsengTea" -> setPrice(2000);
      case "red ginsengTea" -> setPrice(2500);
    }
  }
}
