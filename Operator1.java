package subject;

import java.util.*;
import java.io.*;

public class Operator1 {
    public static void main(String[] args) throws IOException {
        operator5();
    }

    // 1번 문제
    public static void operator() {
        Scanner sc = new Scanner(System.in);

        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int com = sc.nextInt();

        int sum = kor + eng + math + com;
        double avg = sum / 4;

        System.out.println(sum);
        System.out.printf("%.0f", avg);
    }

    // 2번 문제
    public static void operator2() {

        int first = new Scanner(System.in).nextInt();
        int second = new Scanner(System.in).nextInt();

        int mok = first / second;
        int nam = first % second;

        System.out.println(first + " / " + second + " = " + mok + "..." + nam);
    }

    // 3번 문제
    public static void operator3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        width += 5;
        height *= 2;

        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println("area = " + width*height);

        br.close();
    }

    // 4번 문제
    public static void operator4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = outOperator(br, 2);

        int first = num[0];
        int second = num[1];

        System.out.println(++first + " " + second--);
        System.out.println(first + " " + second);
    }
    // 4번 문제 기능 구현
    public static int[] outOperator(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        return num;
    }

    // 5번 문제
    public static void operator5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] person = null;
        try {
            person = outOperator2(br, 2);
            int minsu_h = person[0][0];
            int minsu_w = person[0][1];
            int giyung_h = person[1][0];
            int giyung_w = person[1][1];

            bw.write((minsu_h > giyung_h) && (minsu_w > giyung_w) ? '1' : '0');
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            bw.close();
        }
    }

    // 5번 문제 기능 구현
    public static int[][] outOperator2(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] person = new int[count][2];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2; j++) {
                person[i][j] =Integer.parseInt(st.nextToken());
            }
        }
        return person;
        /*
        int minsu_h = person[0][0];
        int minsu_w = person[0][1];
        int giyung_h = person[1][0];
        int giyung_w = person[1][1];

        bw.write((minsu_h > giyung_h) && (minsu_w > giyung_w) ? '1' : '0');
        bw.flush();
        bw.close();*/
    }
}
