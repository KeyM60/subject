package personal_test.array.Prob_Array;

public class Prob1 {

  public static void main(String[] args) {
    int odd_sum = 0, even_sum = 0;

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    for (int i = 0; i < ia.length; i++) {
      if (ia[i] % 2 == 0) {
        even_sum += ia[i];
      } else {
        odd_sum += ia[i];
      }
    }
    System.out.println("( 배열 ia )");
    System.out.println("홀수의 합 : " + odd_sum);
    System.out.println("짝수의 합 : " + even_sum);

    odd_sum = 0;
    even_sum = 0;
    int[] ib = new int[]{1, 2, 3, 4, 5};
    for (int i = 0; i < ib.length; i++) {
      if (ib[i] % 2 == 0) {
        even_sum += ib[i];
      } else {
        odd_sum += ib[i];
      }
    }
    System.out.println("( 배열 ib )");
    System.out.println("홀수의 합 : " + odd_sum);
    System.out.println("짝수의 합 : " + even_sum);
// ========================== 문제 2
    int[] arrNum = new int[5];
    for (int i = 0; i < arrNum.length; i++) {
      arrNum[i] = (int) (Math.random() * 100) + 1;
    }
    for (int s : arrNum) {
      System.out.print(s + " ");
    }
  }


}
