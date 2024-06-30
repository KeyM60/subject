package personal_test.array.Prob_Array;

import java.util.Scanner;

public class Prob2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arrNum = new int[5];
    int sum = 0;
    float sum_rate = 0.0f;

    for (int i = 0; i < arrNum.length; i++) {
      arrNum[i] = sc.nextInt();
      sum += arrNum[i];
    }

    for (int i = 0; i < arrNum.length; i++) {
      sum_rate = (float) arrNum[i] / sum * 100;
      System.out.print("*".repeat((int) sum_rate));
      System.out.printf("(%.16f)%n", sum_rate);
    }
  }
/*
    char[][] alphabet = new char[5][5];
    char start = 'A';
    int num = 0;

    //1.배열에 알파벳 입력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start++;
      }
    }

    //2.원본 배열 출력
    for (int i = 0; i < alphabet.length; i++) {
      for (char a : alphabet[i]) {
        System.out.print(a + " \t\t");
      }
      System.out.println();
    }

    //3. 배열 수정
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i][i] = '*';
    }

    //4. 수정된 배열 출력
    System.out.println("=========================");
    for (int i = 0; i < alphabet.length; i++) {
      for (char a : alphabet[i]) {
        System.out.print(a + " \t\t");
      }
      System.out.println();
    }
  }*/
}