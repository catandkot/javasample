package first;
// 3주차 과제 9번, "2개의 값을 입력 받아 값을 큰 순서대로 출력하는 프로그램을 작성하시오."
import java.util.Scanner;
public class sortBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second;
        System.out.println("입력 값 : ");
        first = sc.nextInt();
        second = sc.nextInt();
        System.out.println("변수 first => "+first+" 변수 second => "+second);
        System.out.print("출력 값 : ");
        if (second>first) {
            System.out.println(second + " " + first);
            System.out.println("Second가 First보다 큼.");
        } else if (first>second) {
            System.out.println(first + " " + second);
            System.out.println("First가 Second보다 큼.");
        }
        sc.close();
    }
}
