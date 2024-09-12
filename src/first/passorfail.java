package first;
// 3주차 과제 1번, "국어와 영어 점수를 입력 받아 두 점수의 합이 120점 이상이면 합격을, 그렇지 않으면 불합격을 출력하는 프로그램을 작성하시오."
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
