package subject.polymorphism.test2;

public class Rectangle extends Shape {

  private double width;
  private String hight;

  public Rectangle(String name, double width, String hight) {
    super(name);
    this.width = width;
    this.hight = hight;
  }

  void print() {
    calculationArea();
    System.out.println(getName() + "의 면적은 " + getArea());
  }

  @Override
  void calculationArea() {
    setArea(width * Integer.parseInt(hight));
  }
}