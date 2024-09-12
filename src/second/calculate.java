package second;

// 4주차 과제 7번.
// 첫 번째로 숫자를, 두 번째로 연산자(+, -)를, 세 번째로 숫자를 입력 받아 두 번째로 지정된 연산을 수행하고
// 그 결과가 0보다 크면 “수식의 결과는 양수입니다”, 0이면 “수식의 결과가 0입니다”, 0보다 작으면 “수식의 결과가 음수입니다”를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;
public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first,second,result;
        result=0;
        char plusMinus;
        System.out.println("첫번째 수를 입력해주십시오 : ");
        first = sc.nextInt();
        System.out.println("연산자 (+/-)를 입력해주십시오 : ");
        plusMinus = sc.next().charAt(0);
        System.out.println("두번째 수를 입력해주십시오 : ");
        second = sc.nextInt();
        if (plusMinus=='+') {
            result = first + second;
        } else if (plusMinus=='-') {
            result = first - second;
        }
        if (result<0) {
            System.out.println("수식의 결과가 음수입니다.");
        } else if (result==0) {
            System.out.println("수식의 결과가 0입니다.");
        } else if (result>0) {
            System.out.println("수식의 결과는 양수입니다.");
        }
    }
}
