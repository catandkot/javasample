package first;
// 3주차 과제 7번, "나이를 입력 받아 입력된 나이가 19세 미만이면 “미성년자입니다”, 19세이면 “19세입니다”를, 19세보다 많으면 “성인입니다”를 출력하는 프로그램을 작성하시오."
import java.util.Scanner;
public class ageCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("나이를 입력해주십시오.");
        age = sc.nextInt();
        if (age<19) {
            System.out.println("미성년자입니다.");
        } else if (age == 19) {
            System.out.println("19세입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
}
