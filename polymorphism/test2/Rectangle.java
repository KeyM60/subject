package subject.polymorphism.test2;

public class Rectangle extends Shape {

  private double width = 0;
  private String height = "0";

  public Rectangle(String name, double width, String height) {
    super(name);
    this.width = width;
    this.height = height;
  }

  void print() {
    calculationArea();
    System.out.println(getName() + "의 면적은 " + getArea());
  }

  @Override
  void calculationArea() {
    setArea(width * Integer.parseInt(height));
  }
}
