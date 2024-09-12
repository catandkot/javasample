package first;
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
