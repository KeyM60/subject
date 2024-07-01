package subject.polymorphism.test2;

public abstract class Shape {

  protected double area;
  private String name;


  public Shape() {
  }

  public Shape(String name) {
    this.name = name;
  }

  abstract void calculationArea();

  void print() {
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
