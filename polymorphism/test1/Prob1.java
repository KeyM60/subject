package subject.polymorphism.test1;

public class Prob1 {

  public static void main(String[] args) {

    Truck truck = new Truck("봉고3", 60, 4);
    System.out.println("트럭 : 바퀴 " + truck.wheelNumber + " 개 입니다.");
    Bike bike = new Bike("메리다3", 15, 2);
    System.out.println("자전거 : 바퀴 " + bike.wheelNumber + " 개 입니다.");

    truck.speedUp(2);
    bike.speedUp(2);

    truck.speedDown(20);
    bike.speedDown(20);

    truck.speedUp(30);
    bike.speedUp(60);

    truck.stop();
    bike.stop();

  }
}
