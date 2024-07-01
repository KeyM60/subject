package subject.polymorphism.test2;

public class TestShape {

  public static void main(String[] args) {
    Shape[] shape = new Shape[2];
    shape[0] = new Circle("원", 10.0);
    shape[1] = new Rectangle("직사각형", 20, "10");

    shape[0].print();
    shape[1].print();


  }
}