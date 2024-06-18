package subject;

import java.util.*;
import java.io.*;

public class jungol_for1 {
    public static void main(String[] args) throws IOException {

//        jindan1();
//        jindan2();
//        jindan3();
//        jindan4();
//        jindan5();
//        jindan6();
//        hyung1();
//        hyung2();
//        hyung3();
//        hyung4();
        hyung5();

    }

    public static void jindan1() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 0;
        int[] a = new int[15];
        while (i < 15) {
            i++;
            a[i - 1] = i;
        }

        for (int j = 0; j < a.length; j++) {
            bw.write(a[j] + " ");
        }
        bw.flush();
        bw.close();
    }

    public static void jindan2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int num = 1;
        int sum = 0;

        while(true) {
            if(x < 0) {
                x = Integer.parseInt(br.readLine());
            }
            else {
                while(num <= x){
                    sum += num;
                    num++;
                }
                break;
            }
        }
        System.out.println(sum);
    }

    public static void jindan3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int num = Integer.parseInt(br.readLine());
            System.out.printf("number? ");

            if (num == 0) {
                break;
            }
            else if (num < 0) {
                System.out.println("negative number");
            }
            else {
                System.out.println("positive integer");
            }
        }
    }

    public static void jindan4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int count = 0;
        int sum = 0;
        double avg;

        while (num < 100) {
            count++;
            sum += num;
            num = Integer.parseInt(st.nextToken());
        }

        avg = (double)(sum+num)/(count+1);

        System.out.println(sum+num);
        System.out.printf("%.1f", avg);
    }

    public static void jindan5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        while(num!=-1) {
            if(num%3==0) {
                System.out.println(num / 3);
            }
            num = Integer.parseInt(br.readLine());
        }
    }

    public static void jindan6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("1. Korea%n" +
                "2. USA%n" +
                "3. Japan%n" +
                "4. China%n" +
                "number? ");

        int num = Integer.parseInt(br.readLine());

        while((num >= 1) && (num <= 4)) {

            switch (num) {
                case 1: {
                    System.out.println("\nSeoul\n");
                    break;
                }
                case 2: {
                    System.out.println("\nWashington\n");
                    break;
                }
                case 3: {
                    System.out.println("\nTokyo\n");
                    break;
                }
                case 4: {
                    System.out.println("\nBeijing\n");
                    break;
                }
            }

            System.out.printf("1. Korea%n" +
                    "2. USA%n" +
                    "3. Japan%n" +
                    "4. China%n" +
                    "number? ");

            num = Integer.parseInt(br.readLine());

            if ((num == 0) || (num > 4)) {
                System.out.println("\nnone");
                break;
            }
        }
    }

    public static void hyung1() {
        int a = new Scanner(System.in).nextInt();

        for (int i = 1; i<=a; i++) {
            System.out.printf("%d ", i);
        }
    }

    public static void hyung2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int odd = 0;  // 홀수
        int even = 0; // 짝수

        while(num != 0) {
            if(num%2 == 0){
                even++;
            }
            else odd++;

            num = Integer.parseInt(st.nextToken());
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }

    public static void hyung3() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int count = 0;
        int sum = 0;
        double avg;

        while( (num <= 100) && (num >= 0)) {
            count ++;
            sum += num;
            num = Integer.parseInt(st.nextToken());
        }

        avg = sum / (double)count;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }

    public static void hyung4() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int count = 0;

        while(num !=0 ){
            if((num%3 !=0) && (num%5 !=0)){
                count++;
            }
            num = Integer.parseInt(st.nextToken());
        }

        System.out.println(count);

    }

    public static void hyung5() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int base = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            double tw = Double.parseDouble(st.nextToken());
            System.out.println("Base = " + base);
            System.out.println("Height = " + height);
            System.out.printf("Triangle width = %.1f%n", tw);
            System.out.printf("Continue? ");

            char conti = new StringTokenizer(br.readLine()).nextToken().charAt(0);
            if(!((conti == 'y') || (conti == 'Y'))) {
                break;
            }
        }
    }
}