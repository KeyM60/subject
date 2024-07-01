package subject.polymorphism.test1;

public class Truck extends Wheeler {

  public Truck(String carName, int velocity, int wheelNumber) {
    super(carName, velocity, wheelNumber);
  }


  @Override
  public void speedUp(int speed) {
    velocity += speed * 5;
    if (velocity > 100) {
      velocity = 100;
      System.out.println("트럭의 최고속도위반으로 속도를 : " + velocity + "으로 내립니다.");
    } else {
      System.out.println("트럭의 현재 속도 : " + velocity);
    }
  }

  @Override
  public void speedDown(int speed) {
    velocity -= speed * 5;
    if (velocity < 50) {
      velocity = 50;
      System.out.println("트럭의 최저속도위반으로 속도를 : " + velocity + "으로 올립니다.");
    } else {
      System.out.println("트럭의 현재 속도 : " + velocity);
    }
  }
}
