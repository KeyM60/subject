package subject.polymorphism.test1;

public abstract class Wheeler {

  protected int velocity;
  protected String carName;
  protected int wheelNumber;

  Wheeler(String carName, int velocity, int wheelNumber) {
    this.velocity = velocity;
    this.carName = carName;
    this.wheelNumber = wheelNumber;
  }

  abstract public void speedUp(int speed);

  abstract public void speedDown(int speed);

  public void stop() {
    velocity = 0;
    System.out.println("정지상태로 속도를 0으로 초기화합니다.");
  }
}

