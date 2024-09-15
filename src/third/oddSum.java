package third;
import java.util.Scanner;

// 5주차 과제 3번.
// 두 개의 숫자를 입력 받아 두 숫자 사이의 홀수 값을 모두 더하여 출력하는 프로그램을 작성하시오.

public class oddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end,sum=0,count;
        System.out.println("시작값과 종료값을 입력해주십시오.");
        count = sc.nextInt();
        end=sc.nextInt();
        while(count<=end) {
            if(count%2!=0) {
                sum+=count;
            }
            count++;
        }
        System.out.println("시작값과 종료값 사이 홀수의 합은 : "+sum);
    }
}
