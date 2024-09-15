package fourth;
import java.util.Scanner;

// 6주차 과제 1번.
// 하나의 숫자를 입력 받아 1부터 입력된 숫자까지의 합을 구하는 프로그램을 작성하시오.
// 단, 매 10단위마다 중간 결과를 출력하시오.

public class onetoSum {
    public static void main(String[] args) {
        int count = 1, maxValue, result = 0;  // count를 1로 초기화
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주십시오.");
        maxValue = sc.nextInt();

        while (count <= maxValue) {
            result += count;  // count 값을 result에 더함

            if (count % 10 == 0 || count == maxValue) {  // 10의 배수거나 마지막 값일 때
                System.out.println("1 - " + count + "까지의 합 : " + result);
            }
            count++;
        }

        sc.close();  // Scanner 자원 해제
    }
}
