package first;

import java.util.Scanner;
public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int korean, english;
        System.out.println("국어 점수를 입력해주십시오.");
        korean=sc.nextInt();
        System.out.println("영어 점수를 입력해주십시오.");
        english=sc.nextInt();
        if(korean+english>=120) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        sc.close();

    }
}
