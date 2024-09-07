// 3번 과제의 1번 문제

// 입력용 스캐너 임포트
import java.util.Scanner;
public class ageandgrade {
    public static void main(String[] args){
        // 입력용 스캐너 초기화
        Scanner sc = new Scanner(System.in);
        int age;
        double grade;
        System.out.println("나이를 입력해주십시오.");
        age = sc.nextInt();
        System.out.println("학점을 입력해주십시오.");
        grade = sc.nextDouble();
        if(age<30&&grade>=3.5) {
            System.out.println("추천 대상입니다.");
        } else {
            System.out.println("추천 대상이 아닙니다.");
        }
        sc.close();
    }
}