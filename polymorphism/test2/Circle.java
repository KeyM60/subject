package subject.polymorphism.test2;

public class Circle extends Shape {

  private double radius = 0;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  void print() {
    calculationArea();
    System.out.println(getName() + "의 면적은 " + getArea());
  }

  @Override
  void calculationArea() {
    setArea(Math.PI * radius * radius);
  }
}
