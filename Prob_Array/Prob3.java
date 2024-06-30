package personal_test.array.Prob_Array;

import java.util.Arrays;

public class Prob3 {

  public static void main(String[] args) throws Exception {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    Prob3 p = new Prob3();

    // 문제 1
    /*
    System.out.println("( 배열 ia )");
    p.calc(ia);
    System.out.println("( 배열ib )");
    p.calc(ib);*/

    // 문제2
    /*
    int[] random_arr = p.generateRandom();
    System.out.println("\n====================");
    p.getMaxNum(random_arr);*/

    // 문제3
    int[] array1 = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
    System.out.println("<< 중복되지 않은 숫자 >>");
    printUniqueNumber(array1);

    // 문제5
    int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

    int maxValue = getValue(values, true);
    int minValue = getValue(values, false);

    System.out.println("최대값 = " + maxValue);
    System.out.println("최소값 = " + minValue);

    // 문제6
    Prob3 median = new Prob3();
    int[] values1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
    System.out.println("input : " + Arrays.toString(values1));
    System.out.println("median : " + median.findMedian(values1));
    System.out.println("=================================================");

    int[] values2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
    System.out.println("input : " + Arrays.toString(values2));
    System.out.println("median : " + median.findMedian(values2));

    // 문제7
    // 비율 결과: 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
    p.calculate(new int[]{10, 30, 20, 80, 50});

    // 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
    p.calculate(new int[]{50, 50, 50, 50, 50});

    // 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
    p.calculate(new int[]{1, 2, 3, 4, 5});

    // 문제8
    int[][] arr_num = new int[5][5];
    int num = 1;
    for (int i = 0; i < arr_num.length; i++) {
      for (int j = 4; 0 <= j; j--) {
        arr_num[i][j] += num++;
      }
    }
    for (int[] ints : arr_num) {
      for (int i : ints) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    // 문제9
    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start++;
      }
    }
    //2.원본 배열 출력
    for (char[] ints : alphabet) {
      for (char a : ints) {
        System.out.print(a + "\t\t");
      }
      System.out.println();
    }
    //3. 배열 수정
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i][i] = '*';
    }
    //4. 수정된 배열 출력
    for (char[] ints : alphabet) {
      for (char a : ints) {
        System.out.print(a + "\t\t");
      }
      System.out.println();
    }

    // 문제10
    int a[][] = {{30, 30, 30, 30}, {40, 40, 40, 40}, {50, 50, 50, 50}};
    int b[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    int c[][] = new int[3][4];

    p.sub(a, b, c);
    p.prn(c);

    // 문제11
    int[] arr1 = {2, 5, 6, 9, 10, 2, 7};
    int[] arr2 = {3, 5, 6, 9, 10, 2, 7};

    if (equalsArr(arr1, arr2)) {
      System.out.println("two array equals");
    } else {
      System.out.println("two array not-equals");
    }

    System.out.println("=====================");

    int[] arr3 = {3, 5, 6, 9};
    int[] arr4 = {3, 5, 6, 9, 8};
    if (equalsArr(arr3, arr4)) {
      System.out.println("two array equals");
    } else {
      System.out.println("two array not-equals");
    }

    // 문제12
    int[] inputNumbers = {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
    p.ascending(inputNumbers);

    // 문제13
    char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    // p.reverseString(s, 0, 3);
    // p.reverseString(s, 4, 7);
    // p.reverseString(s, 8, 10);
    p.reverseString(s, 0, 10);

  }


  // 문제 1 메소드
  public void calc(int[] ix) {
    int odd_sum = 0, even_num = 0;

    for (int i = 0; i < ix.length; i++) {
      if (ix[i] % 2 == 0) {
        even_num += ix[i];
      } else {
        odd_sum += ix[i];
      }
    }
    System.out.println("홀수의 합 : " + odd_sum);
    System.out.println("짝수의 합 : " + even_num);
  }

  // 문제 2 메소드
  int[] generateRandom() {
    int[] arr_num = new int[10];
    for (int i = 0; i < arr_num.length; i++) {
      arr_num[i] = (int) (Math.random() * 30) + 1;
    }
    System.out.println("<< 생성된 난수 >>");
    for (int n : arr_num) {
      System.out.print(n + " ");
    }
    return arr_num;
  }

  // 문제 2 메소드
  void getMaxNum(int[] arr) {
    int num = arr[0];
    for (int i = 0; i < arr.length; i++) {
      num = num > arr[i] ? num : arr[i];
    }
    System.out.println("배열에서 가장 큰수 : " + num);
  }

  // 문제 3 메소드
  private static void printUniqueNumber(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] == array[j] && i != j) {
          count++;
        }
      }
      if (count == 0) {
        System.out.print(array[i] + " ");
      }
      count = 0;
    }
    System.out.println();
  }

  // 문제5 메소드
  public static int getValue(int[] values, boolean isMax) {
    int num = values[0]; // 배열 내 기준값 설정

    if (isMax) {
      for (int arr : values) {
        num = num < arr ? arr : num;
      }
    } else {
      for (int arr : values) {
        num = num < arr ? num : arr;
      }
    }
    return num;
  }

  // 문제6 메소드
  public int findMedian(int[] values) {
    int sum = 0;
    double avg = 0.0;
    double middle_num = 0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    avg = (double) sum / values.length; // 35 ,, 51.3

    middle_num = values[0]; // 초기값 설정

    for (int i = 1; i < values.length; i++) {
      if (Math.abs(avg - middle_num) == Math.abs(avg - values[i])) { // 작은 값 비교
        middle_num = middle_num < values[i] ? middle_num : values[i];
        continue;
      }
      middle_num = Math.abs(avg - middle_num) > Math.abs(avg - values[i]) ? values[i] : middle_num;
    }
    return (int) middle_num;
  }

  // 문제7 메소드
  public void calculate(int[] nums) throws Exception {
    double sum = 0;
    double avg = 0.0;
    for (int a : nums) {
      sum += a;
    }

    for (int a : nums) {
      avg = Math.round(a / sum * 100);
      System.out.print("*".repeat((int) Math.round(avg / 2)));
      System.out.printf("(%.1f%%)\n", avg);
    }
  }

  // 문제10 메소드1
  public int[][] sub(int[][] a, int[][] b, int[][] c) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        c[i][j] = a[i][j] - b[i][j];
      }
    }
    return c;
  }

  // 문제10 메소드2
  public void prn(int[][] c) {
    for (int[] ints : c) {
      for (int i : ints) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  // 문제11 메소드
  private static boolean equalsArr(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    } else {
      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
          return false;
        }
      }
      return true;
    }
  }

  // 문제12 메소드
  public int[] ascending(int[] inputNumbers) {
    int temp;
    for (int i = 0; i < inputNumbers.length; i++) {
      for (int j = i + 1; j < inputNumbers.length; j++) {
        if (inputNumbers[i] > inputNumbers[j]) {
          temp = inputNumbers[i];
          inputNumbers[i] = inputNumbers[j];
          inputNumbers[j] = temp;
        }
      }
    }
    System.out.print("리턴값 : {");
    for (int i = 0; i < inputNumbers.length - 1; i++) {
      System.out.print(inputNumbers[i] + ", ");
    }
    System.out.println(inputNumbers[inputNumbers.length - 1] + "}");

    return inputNumbers;
  }

  // 문제13 메소드
  char[] reverseString(char[] s, int start, int end) {
    char temp;
    while (start < end) {
      temp = s[start]; //4 7 5 6 65
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
    for (char a : s) {
      System.out.print(a);
    }
    return s;
  }
}