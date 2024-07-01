package subject.polymorphism.test3;

public class Tea extends Beverage {

  static int amount;

  public Tea(String name) {
    super(name);

    calcPrice();
  }

  @Override
  void calcPrice() {
    if (getName().equals("lemonTea")) {
      setPrice(1500);
    } else if (getName().equals("ginsengTea")) {
      setPrice(2000);
    } else if (getName().equals("red ginsengTea")) {
      setPrice(2500);
    }
  }
}
