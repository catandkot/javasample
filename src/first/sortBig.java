package first;
// 3주차 과제 9번, "2개의 값을 입력 받아 값을 큰 순서대로 출력하는 프로그램을 작성하시오."
import java.util.Scanner;
public class sortBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second;
        // 두개의 값을 저장하기 위한 변수를 생성합니다.
        System.out.println("입력 값 : ");
        first = sc.nextInt();
        second = sc.nextInt();
        // 두개의 값을 입력받은 후, 처음 값은 first, 이후 값은 second에 저장합니다.
        // System.out.println("변수 first => "+first+" 변수 second => "+second);
        // 값 체크를 위한 임시 함수입니다.
        System.out.print("출력 값 : ");
        if (second>first) {
            System.out.println(second + " " + first);
        } else if (first>second) {
            System.out.println(first + " " + second);
        }
        // 출력 값을 표시하기 위해 개행 없이 첫 문장을 출력한 후, 두 변수의 값을 비교한 후, 큰 순서대로 출력합니다.
        sc.close();
    }
}
