package person_test.Array_jungol;

import java.util.Scanner;

public class Arr2 {

  public static void main(String[] args) {
    Arr2 arr = new Arr2();
    // arr.test1(); // 자가진단1
    // arr.test2(); // 자가진단2
    // arr.test3(); // 자가진단3
    // arr.test4(); // 자가진단4
    // arr.test5(); // 자가진단5
    // arr.test6(); // 자가진단6
    // arr.test7(); // 자가진단7
    // arr.estimate1(); // 형성평가1
    // arr.estimate2(); // 형성평가2
    // arr.estimate3(); // 형성평가3
    // arr.estimate4(); // 형성평가4
    // arr.estimate5(); // 형성평가5
    // arr.estimate6(); // 형성평가6
    // arr.estimate7(); // 형성평가7
    // arr.estimate8(); // 형성평가8
    // arr.estimate9(); // 형성평가9
    // arr.estimate10(); // 형성평가10

  }

  void test1() {
    // 입력 값 결정
    Scanner sc = new Scanner(System.in);
    char[] arr_ch = new char[100]; // 최소 두개 구현 못함
    char temp;
    int count = 0;
    for (int i = 0; i < arr_ch.length; i++) {
      arr_ch[i] = sc.next().charAt(0);
      count++;
      if (arr_ch[i] < 65 || arr_ch[i] > 91) {
        break;
      }
    }

    // 문자 순서 정렬
    for (int i = 0; i < count - 1; i++) { // 마지막 값 제외
      for (int j = i + 1; j < count - 1; j++) {
        if (arr_ch[i] > arr_ch[j]) {
          temp = arr_ch[i];
          arr_ch[i] = arr_ch[j];
          arr_ch[j] = temp;
        }
      }
    }

    // 다음 값이 동일하지 않을 때 현재 인덱스를 값으로 출력
    for (int i = 0, k = 0; i < count - 1; i++) {
      if (arr_ch[i] != arr_ch[i + 1]) {
        System.out.println(arr_ch[i] + " : " + (i - k + 1));
        k = i + 1; // 연산될 인덱스 기준 초기화
      } else if (arr_ch[i] == 0) {
        break;
      }
    }
  }

  void test2() {
    Scanner sc = new Scanner(System.in);
    int[] arr_num = new int[10];
    int num = sc.nextInt();

    while (true) { // 마지막 0값까지 입력
      arr_num[num / 10]++; // 배열을 값 저장소로 활용
      if (num == 0) {
        break;
      }
      num = sc.nextInt();
    }

    for (int i = 0; i < arr_num.length; i++) {
      if (arr_num[i] != 0) { // 값이 있을 때만
        System.out.println(i + " : " + arr_num[i]);
      }
    }
  }

  void test3() {
    Scanner sc = new Scanner(System.in);
    int[] arr_num = new int[100];
    arr_num[0] = 100;
    arr_num[1] = sc.nextInt();
    for (int i = 2; i < arr_num.length; i++) {
      arr_num[i] = arr_num[i - 2] - arr_num[i - 1];
      if (arr_num[i] < 0) {
        break;
      }
    }
    for (int a : arr_num) {
      System.out.print(a + " ");
      if (a < 0) {
        break;
      }
    }
  }

  void test4() {
    Scanner sc = new Scanner(System.in);
    int[][] arr_num = new int[3][5];
    for (int i = 0; i < arr_num.length; i++) {
      for (int j = 0; j < arr_num[i].length; j++) {
        arr_num[i][j] = sc.nextInt();
      }
    }
    for (int[] ints : arr_num) { // enhanced for 2중 반목문 사용법
      for (int a : ints) {
        System.out.printf("%2d   ", a);
      }
      System.out.println();
    }
  }

  void test5() {
    Scanner sc = new Scanner(System.in);
    int[][] arr_1st = new int[2][4];
    int[][] arr_2nd = new int[2][4];
    System.out.println("first array");
    for (int i = 0; i < arr_1st.length; i++) {
      for (int j = 0; j < arr_1st[i].length; j++) {
        arr_1st[i][j] = sc.nextInt();
      }
    }
    System.out.println("second array");
    for (int i = 0; i < arr_2nd.length; i++) {
      for (int j = 0; j < arr_2nd[i].length; j++) {
        arr_2nd[i][j] = sc.nextInt();
      }
    }
    // 출력
    for (int i = 0; i < arr_1st.length; i++) {
      for (int j = 0; j < arr_1st[i].length; j++) {
        System.out.print(arr_1st[i][j] * arr_2nd[i][j] + " ");
      }
      System.out.println();
    }
  }

  void test6() {
    Scanner sc = new Scanner(System.in);
    int[][] arr_stu = new int[5][4];
    double avg = 0.0;
    int count = 0;
    for (int i = 0; i < arr_stu.length; i++) {
      for (int j = 0; j < arr_stu[i].length; j++) {
        arr_stu[i][j] = Integer.parseInt(sc.next());
      }
    }
    for (int[] ints : arr_stu) {
      for (int a : ints) {
        avg += a;
      }
      avg /= ints.length;
      if (avg >= 80.0) {
        count++;
        System.out.println("pass");
      } else {
        System.out.println("fail");
      }
      avg = 0;
    }
    System.out.println("Successful : " + count);
  }

  void test7() { // 좌측 0처리 안함.
    int[][] arr_num = new int[5][5];

    for (int i = 0; i < arr_num[0].length; i++) {
      arr_num[0][i] = 1;
    }
    for (int i = 1; i < arr_num.length; i++) {
      for (int j = 0; j < arr_num[i].length; j++) {
        if (j == 0) {
          arr_num[i][j] = arr_num[i - 1][j];
        } else {
          arr_num[i][j] = arr_num[i - 1][j] + arr_num[i][j - 1];
        }
      }
    }
    for (int[] ints : arr_num) {
      for (int a : ints) {
        System.out.print(a + " ");
      }
      System.out.println();
    }
  }

  void estimate1() {
    int num = 1;
    int[] arr_num = new int[6];
    for (int i = 0; i < 10; i++) {
      int dice = (int) (Math.random() * 6) + 1;
      System.out.print(dice + " ");
      dice--;
      for (int j = 0; j < 6; j++) {
        if (dice == j) {
          arr_num[j]++;
        }
      }
    }
    System.out.println();
    for (int a : arr_num) {
      System.out.println(num++ + " : " + a);
    }
  }

  void estimate2() {
    Scanner sc = new Scanner(System.in);
    int[] arr_stu = new int[100];
    int[] arr_num = new int[11];
    int num = 0;
    for (int i = 0; i < arr_stu.length; i++) {
      arr_stu[i] = sc.nextInt();
      if (arr_stu[i] == 0) {
        num = i;
        break;
      }
    }
    for (int i = 0; i <= num; i++) {
      int num1 = arr_stu[i] / 10;
      arr_num[num1]++;
    }
    for (int i = arr_num.length - 1; 0 <= i; i--) {
      if (arr_num[i] != 0) {
        System.out.println(i * 10 + " : " + arr_num[i]);
      }


    }
  }

  void estimate3() {
    Scanner sc = new Scanner(System.in);
    int[] arr_num = new int[10];
    arr_num[0] = sc.nextInt();
    arr_num[1] = sc.nextInt();
    for (int i = 0; i < arr_num.length; i++) {
      if (i >= 2) {
        arr_num[i] = (arr_num[i - 2] + arr_num[i - 1]) % 10;
        System.out.print(arr_num[i] + " ");
      } else {
        System.out.print(arr_num[i] + " ");
      }
    }
  }

  void estimate4() {
    int[][] arr_num = new int[][]{{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
    int sum = 0;
    for (int[] ints : arr_num) {
      for (int a : ints) {
        System.out.print(a + " ");
        sum += a;
      }
      System.out.printf("\n");
    }
    System.out.print(sum);
  }

  void estimate5() {
    Scanner sc = new Scanner(System.in);
    int[][] arr_num = new int[4][3];
    int sum = 0;
    for (int i = 0; i < arr_num.length; i++) {
      System.out.print(i + 1 + "class? ");
      for (int j = 0; j < arr_num[i].length; j++) {
        arr_num[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < arr_num.length; i++) {
      System.out.print(i + 1 + "class? : ");
      for (int j = 0; j < arr_num[i].length; j++) {
        sum += arr_num[i][j];
      }
      System.out.println(sum);
      sum = 0;
    }
  }

  void estimate6() {
    int[][] arr_num = new int[5][5];
    arr_num[0][0] = 1;
    arr_num[0][2] = 1;
    arr_num[0][4] = 1;
    for (int i = 1; i < arr_num.length; i++) {
      for (int j = 0; j < arr_num[i].length; j++) {
        if (i % 2 == 1) {
          if (j % 2 == 0) {
            arr_num[i][j] = 0;
          } else {
            arr_num[i][j] = arr_num[i - 1][j - 1] + arr_num[i - 1][j + 1];
          }
        } else {
          if (j == 0 && j == arr_num[i].length-1) {
            arr_num[i][j] = arr_num[i - 1][1];
          } else if (j == arr_num[i].length / 2) {
            arr_num[i][j] = arr_num[i - 1][j - 1] + arr_num[i - 1][j + 1];
          }
        }
      }
    }
    for (int[] ints : arr_num) {
      for (int a : ints) {
        System.out.print(a + " ");
      }
      System.out.println();
    }
  }

  void estimate7() {
    Scanner sc = new Scanner(System.in);
    int[][] arr_num1 = new int[2][3];
    int[][] arr_num2 = new int[2][3];
    int[][] arr_num3 = new int[2][3];

    System.out.println("first array");
    for (int i = 0; i < arr_num1.length; i++) {
      for (int j = 0; j < arr_num1[i].length; j++) {
        arr_num1[i][j] = sc.nextInt();
      }
    }
    System.out.println("second array");
    for (int i = 0; i < arr_num1.length; i++) {
      for (int j = 0; j < arr_num1[i].length; j++) {
        arr_num2[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < arr_num2.length; i++) {
      for (int j = 0; j < arr_num2[i].length; j++) {
        arr_num3[i][j] = arr_num1[i][j] * arr_num2[i][j];
        System.out.print(arr_num3[i][j] + " ");
      }
      System.out.println();
    }

  }

  void estimate8() {
    Scanner sc = new Scanner(System.in);
    int[][] arr_num = new int[4][2];
    int width = 0, height = 0, avg = 0;

    for (int i = 0; i < arr_num.length; i++) {
      for (int j = 0; j < arr_num[i].length; j++) {
        arr_num[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < arr_num.length; i++) {
      for (int j = 0; j < arr_num[i].length; j++) {
        width += arr_num[i][j];
      }
      System.out.print(width / arr_num[i].length + " ");
      width = 0;
    }

    System.out.println();
    for (int j = 0; j < arr_num[0].length; j++) {
      for (int i = 0; i < arr_num.length; i++) {
        height += arr_num[i][j];
      }
      System.out.print(height / arr_num.length + " ");
      height = 0;
    }

    System.out.println();
    for (int i = 0; i < arr_num.length; i++) {
      for (int j = 0; j < arr_num[i].length; j++) {
        avg += arr_num[i][j];
      }
    }
    System.out.println(avg / 8);
  }

  void estimate9() {
    int[][] arr_num = new int[10][10];
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int j = 0; j < 10; j++) {
      arr_num[0][j] = 0;
    }
    arr_num[0][1] = 1;

    for (int i = 1; i < arr_num.length; i++) {
      for (int j = 1; j < arr_num[i].length; j++) {
        arr_num[i][j] = arr_num[i - 1][j - 1] + arr_num[i - 1][j];
      }
    }
    for (int i = num - 1; 0 <= i; i--) {
      for (int j = 1; j < arr_num[i].length; j++) {
        if (arr_num[i][j] == 0) {
          continue;
        }
        System.out.print(arr_num[i][j] + " ");
      }
      System.out.println();
    }
  }

  void estimate10() {
    char[][] arr_char = new char[3][5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr_char.length; i++) {
      for (int j = 0; j < arr_char[i].length; j++) {
        arr_char[i][j] = sc.nextLine().charAt(0);
      }
    }
    for (int i = 0; i < arr_char.length; i++) {
      for (int j = 0; j < arr_char[i].length; j++) {
        System.out.print(String.valueOf(arr_char[i][j]).toLowerCase() + " ");
      }
      System.out.println();
    }

  }

}
