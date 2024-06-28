package person_test.Array_jungol;

import java.util.Arrays;
import java.util.Scanner;

public class Arr1 {

  public static void main(String[] args) {
    Arr1 arr = new Arr1();
    // arr.test1(); // 자가진단1
    // arr.test2(); // 자가진단2
    // arr.test3(); // 자가진단3
    // arr.test4(); // 자가진단4
    // arr.test5(); // 자가진단5
    // arr.test6(); // 자가진단6
    // arr.test7(); // 자가진단7
    // arr.test8(); // 자가진단8
    // arr.test9(); // 자가진단9
    // arr.eval_1(); // 형성평가1
    // arr.eval_2(); // 형성평가2
    // arr.eval_3(); // 형성평가3
    // arr.eval_4(); // 형성평가4
    // arr.eval_5(); // 형성평가5
    // arr.eval_6(); // 형성평가6
    // arr.eval_7(); // 형성평가7
    // arr.eval_8(); // 형성평가8
    // arr.eval_9(); // 형성평가9
    // arr.eval_10(); // 형성평가10

  }

  void test1() {
    Scanner sc = new Scanner(System.in);
    String[] arrEng = new String[10];
    for (int i = 0; i < arrEng.length; i++) {
      arrEng[i] = sc.nextLine();
    }

    for (String s : arrEng) {
      System.out.print("".concat(s));
    }
  }

  void test2() {
    int[] arrNum = new int[10];
    int num = 1;
    for (int n : arrNum) {
      n = num++;
      System.out.print(n + " ");
    }
  }

  void test3() {
    String st = new Scanner(System.in).nextLine();
    String[] stArr = st.split(" ");
    System.out.print(stArr[0] + " " + stArr[3] + " " + stArr[6]);
  }

  void test4() {
    int[] arrNum = new int[100];
    boolean bl = false;
    int n = 0;
    while (!bl) {
      arrNum[n] = new Scanner(System.in).nextInt();
      if (arrNum[n] == 0) {
        for (int i = n - 1; 0 <= i; i--) {
          System.out.print(arrNum[i]);
        }
        bl = true;
      }
      n++;
    }
  }

  void test5() {
    double[] arrNum = new double[6];
    arrNum[0] = 85.6;
    arrNum[1] = 79.5;
    arrNum[2] = 83.1;
    arrNum[3] = 80.0;
    arrNum[4] = 78.2;
    arrNum[5] = 75.0;

    String num = new Scanner(System.in).nextLine();
    int num1 = Integer.parseInt(String.valueOf(num.charAt(0))) - 1;
    int num2 = Integer.parseInt(String.valueOf(num.charAt(2))) - 1;

    double avg = arrNum[num1] + arrNum[num2];
    System.out.print(avg);
  }

  void test6() {
    int[] arrNum = new int[10];
    int temp = 0, change_num = 1000;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arrNum.length; i++) {
      do {
        arrNum[i] = sc.nextInt();
      } while (arrNum[i] > 1000);
    }

    for (int i = 0; i < arrNum.length - 1; i++) {
      temp = Math.min(arrNum[i], arrNum[i + 1]);
      change_num = Math.min(change_num, temp);
    }
    System.out.print(change_num);
  }

  void test7() {
    int[] arrNum = new int[10];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arrNum.length; i++) {
      do {
        arrNum[i] = sc.nextInt();
      } while (arrNum[i] < 1 || arrNum[i] >= 10000);
    }

    int p_min = 1, p_max = 9999;
    // 100이하 최솟값, 최댓값
    for (int a : arrNum) {
      if (a < 100) {
        p_min = Math.max(p_min, a);
      }
      if (a >= 100) {
        p_max = Math.min(p_max, a);
      }
    }
    // 100 출력
    p_min = p_min == 1 ? 100 : p_min;
    p_max = p_max == 9999 ? 100 : p_max;

    System.out.print(p_min + " " + p_max);
  }

  void test8() {
    Scanner sc = new Scanner(System.in);
    int[] arrNum = new int[10];
    for (int i = 0; i < arrNum.length; i++) {
      do {
        arrNum[i] = sc.nextInt();
      } while (arrNum[i] >= 100_000_000);
    }

    int odd_sum = 0, even_sum = 0;
    int count_odd = 0;

    for (int i = 0; i < arrNum.length; i++) {
      odd_sum += arrNum[i];
      count_odd++;

      i++;
      even_sum += arrNum[i];
    }

    double odd_avg = (double) odd_sum / count_odd;

    System.out.println("sum : " + even_sum);
    System.out.println("avg : " + odd_avg);

  }

  void test9() {
    Scanner sc = new Scanner(System.in);
    int[] arrNum = new int[10];
    int temp;

    for (int i = 0; i < arrNum.length; i++) {
      arrNum[i] = sc.nextInt();
    }
    for (int i = 0; i < arrNum.length - 1; i++) {
      for (int j = i + 1; j < arrNum.length; j++) {
        if (arrNum[i] < arrNum[j]) {
          temp = arrNum[i];
          arrNum[i] = arrNum[j];
          arrNum[j] = temp;
        }
      }
    }
    for (int n : arrNum) {
      System.out.print(" " + n);
    }
  }

  void eval_1() {
    Scanner sc = new Scanner(System.in);
    String[] arr_str = new String[10];
    for (int i = 0; i < arr_str.length; i++) {
      arr_str[i] = sc.next();
    }

    for (int i = arr_str.length - 1; i >= 0; i--) {
      System.out.print(arr_str[i] + " ");

    }
  }

  void eval_2() {
    Scanner sc = new Scanner(System.in);
    int[] arr_num = new int[5];
    int sum = 0;

    for (int i = 0; i < arr_num.length; i++) {
      arr_num[i] = sc.nextInt();
    }

    for (int i = 0; i < arr_num.length; i += 2) {
      sum += arr_num[i];
    }

    System.out.print(sum);
  }

  void eval_3() {
    int odd_sum = 0, even_sum = 0;
    int[] arr_num = new int[10];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arr_num.length; i++) {
      arr_num[i] = sc.nextInt();
    }

    for (int i = 0; i < arr_num.length; i++) {
      odd_sum += arr_num[i];
      i++;
      even_sum += arr_num[i];
    }

    System.out.println("odd : " + odd_sum);
    System.out.println("even : " + even_sum);
  }

  void eval_4() {
    Scanner sc = new Scanner(System.in);
    int n = 0, three = 0;
    int[] arr_num = new int[100];

    for (int i = 0; i < arr_num.length; i++) {
      arr_num[i] = sc.nextInt();
      if (arr_num[i] == -1 && i >= 3) {
        n = i;
        three = 3;
        break;
      } else if (arr_num[i] == -1 && i < 3) {
        n = i;
        three = i;
        break;
      }
    }
    if (three == 3) {
      for (int i = n - 1; i >= n - 3; i--) {
        System.out.print(arr_num[i] + " ");
      }
    } else {
      for (int i = n - 1; i >= 0; i--) {
        System.out.print(arr_num[i] + " ");
      }
    }
  }

  void eval_5() {
    Scanner sc = new Scanner(System.in);
    double avg = 0.0;
    double[] arr_num = new double[6];
    for (int i = 0; i < arr_num.length; i++) {
      arr_num[i] = sc.nextDouble();
      avg += arr_num[i];
    }
    System.out.printf("%.1f", avg / 6);
  }

  void eval_6() {
    Scanner sc = new Scanner(System.in);
    char[] arr_ch = new char[]{'J', 'U', 'N', 'G', 'O', 'L'};
    char ch = sc.next().charAt(0);
    for (int i = 0; i < arr_ch.length; i++) {
      if (ch == arr_ch[i]) {
        System.out.println(i + 1);
        break;
      } else {
        System.out.println("none");
        break;
      }
    }
  }

  void eval_7() {
    Scanner sc = new Scanner(System.in);
    int[] arr_num = new int[100];
    int count = 0, max = 0, min = 0;
    for (int i = 0; i < arr_num.length; i++) {
      do {
        arr_num[i] = sc.nextInt();
      } while (arr_num[i] >= 1000);
      count++;
      if (arr_num[i] == 999) {
        break;
      }
    }
    for (int i = 0; i < count - 1; i++) {
      max = Math.max(arr_num[i], max);
      min = Math.min(arr_num[i], min);
    }
    System.out.println("max : " + max);
    System.out.println("min : " + min);
  }

  void eval_8() {
    Scanner sc = new Scanner(System.in);
    int[] arr_num = new int[100];
    int count = 0, fifth = 0, fifth_count = 0;
    for (int i = 0; i < arr_num.length; i++) {
      arr_num[i] = sc.nextInt();
      count++;
      if (arr_num[i] == 0) {
        break;
      }
    }
    for (int i = 0; i < count - 1; i++) { // 0값 제외
      fifth += (arr_num[i] % 5 == 0) ? arr_num[i] : 0;
      fifth_count += arr_num[i] % 5 != 0 ? 1 : 0;
      // 35 10 23 100 64 51 5 0
    }

    System.out.println("Multiples of 5 : " + (count - 1 - fifth_count)); // 0값 제외
    System.out.println("sum : " + fifth);
    System.out.println("avg : " + (double) fifth / (count - 1 - fifth_count)); // 0값 제외
  }

  void eval_9() {
    Scanner sc = new Scanner(System.in);
    int[] arr_num = new int[100];
    int count = 0;
    for (int i = 0; i < arr_num.length; i++) {
      count++;
      arr_num[i] = sc.nextInt();
      if (arr_num[i] == 0) {
        break;
      }
    }
    System.out.println(count - 1); // 0 제외
    for (int i = 0; i < count - 1; i++) {
      if (arr_num[i] % 2 == 1) {
        arr_num[i] *= 2;
      } else {
        arr_num[i] /= 2;
      }
      System.out.print(arr_num[i] + " ");
    }
  }

  void eval_10() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = 0;
    while (n > 20) {
      n = sc.nextInt();
    }
    int[] arr_num = new int[n];
    for (int i = 0; i < arr_num.length; i++) {
      arr_num[i] = sc.nextInt();
    }
    for (int i = 0; i < arr_num.length; i++) {
      for (int j = i; j < arr_num.length; j++) {
        if (arr_num[i] < arr_num[j]) {
          temp = arr_num[i];
          arr_num[i] = arr_num[j];
          arr_num[j] = temp;
        }
      }
      System.out.println(arr_num[i]);
    }

  }

}