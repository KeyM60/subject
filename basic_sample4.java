package subject;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class basic_sample4 {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    basic_sample4 test = new basic_sample4();
    // test.test();
    // test.fourToOne(8);   // 4-1
    // test.fourToTwo();    // 4-2
    // test.fourToThree();  // 4-3
    // test.fourToFour();   // 4-4
    // test.fourToFive();   // 4-5
    // test.fourToSix();    // 4-6
    // test.fourToSeven();  // 4-7
    // test.fourToEight();  // 4-8
    // test.fourToNine();   // 4-9
    // test.fourToTen();    // 4-10
  }

  void test() {
    boolean flag = false;
    // 4-1-1
    int num = sc.nextInt();     //입력 받은 값에서 개행문자(\n)를 제외한 값 반환
    flag = num > 10 && num < 20;
    System.out.println(flag);

    // sc.nextLine();       // "\n" 개행문자 처리
    // 개행문자를 포함하여 라인을 읽고 개행문자 제외, 나머지만 리턴

    // 4-1-2
    char ch = sc.nextLine().charAt(0);
    // nextInt의 Scanner 버퍼에 개행문자 잔여로 에러
    // 따라서, 사용 전 버퍼처리 또는 next()로 변경
    // next() - 공백 전까지의 단어, 개행 문자를 가져오지않음
    flag = ch != ' ' && ch != '\t';
    System.out.println(flag);
  }

  void fourToOne(int n) {
    boolean flag = false;

    switch (n) {
      case 1: {
        // 4-1-1
        int num = sc.nextInt();
        flag = num > 10 && num < 20;
        System.out.println(flag);
      }
      case 2: {
        // 4-1-2

        //char ch = sc.nextLine(); // nextInt의 버퍼에 잔여 데이터 제외
        char ch = sc.next().charAt(0);
        flag = ch != ' ' && ch != '\t';
        System.out.println(flag);
      }
      case 3: {
        // 4-1-3
        char ch = sc.next().charAt(0);
        flag = ch == 'x' || ch == 'X';
        System.out.println(flag);
      }
      case 4: {
        // 4-1-4
        char ch = sc.next().charAt(0);
        System.out.println(Integer.parseInt(String.valueOf(ch)));
        flag = (Integer.parseInt(String.valueOf(ch)) >= 0
            && Integer.parseInt(String.valueOf(ch)) <= 9);
        System.out.println(flag);
      }
      case 5: {
        // 4-1-5
        char ch = sc.next().charAt(0);
        flag = Character.toUpperCase(ch) >= 65 && Character.toUpperCase(ch) <= 90;
        System.out.println(flag);
      }
      case 6: {
        // 4-1-6
        int year = sc.nextInt();
        flag = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
        System.out.println(flag);
      }

      // 4-1-7 문제 이해 못함
      case 7: {
        boolean powerOn = false;
        flag = !powerOn;
        System.out.println(flag);
      }

      // 4-1-8 문제 이해 못함
      case 8: {
        String str = sc.nextLine();
        flag = str.equals("yes") ? true : false;
        System.out.println(flag);
      }
    }
  }

  void fourToTwo() {
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      sum += (i % 3 != 0) && (i % 2 != 0) ? i : 0;
    }
    System.out.println(sum);
  }

  void fourToThree() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j < i; j++) {
        sum += j;
        System.out.print(j + " + ");
      }
      sum += i;
      System.out.print(i + " + ");
    }
    System.out.println(sum);
  }

  void fourToFour() { //아직 못품
    int sum = 0;
    int plus = 1;
    int minus = 0;
    System.out.print(plus + " + ");
    while (sum < 100) {
      sum += plus + minus;
      plus += 2;
      minus -= 2;
      System.out.print("(" + minus + " ) + " + plus + " + ");
    }
    System.out.println();
    System.out.println(plus);
  }

  void fourToFive() {
    int a = 1;
    while (a <= 10) {
      int n = 1;
      while (n <= a) {
        System.out.print("*");
        n++;
      }
      System.out.println("");
      a++;
    }
  }

  void fourToSix() {
    System.out.println("1번,2번 주사위");
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (i + j == 6) {
          System.out.println("(" + i + ",\t" + j + ")");
        }
      }
    }
  }

  void fourToSeven() {
    String str = "12345";
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      sum += Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    System.out.println("sum=" + sum);
  }

  void fourToEight() {
    int value = (int) (Math.random() * 6 + 1);
    System.out.println("value:" + value);
  }

  void fourToNine() {
    int num = 12345;
    int sum = 0;

    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println("sum=" + sum);
  }

  void fourToTen() {
    int answer = (int) (Math.random() * 100 + 1);
    int input = 0;
    int count = 0;

    java.util.Scanner s = new java.util.Scanner(System.in);

    do {
      count++;
      System.out.println("1과 100사이의 값을 입력하세요 : ");
      input = s.nextInt();
      if (input == answer) {
        System.out.println("빙고, 시도 횟수 : " + count);
        break;
      } else {
        System.out.print("같지않아요. 다시 ");
      }
    } while (true);
  }
}
