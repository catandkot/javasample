package fourth;
import java.util.Scanner;

// 6주차 과제 8번.
// 사용자로부터 하나의 숫자를 입력 받아 1부터 입력 받은 숫자 사이의 소수를 구하여 출력하는 프로그램을 작성하시오.


public class primePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주십시오 : ");
        int input = sc.nextInt();
        for (int i=1; i<=input; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPrime(int n) {
        if (n==1|n==0) {
            return false;
        } else {
            for (int i=2; i<=Math.sqrt(n); i++) {
                if (n%i==0) { return false; }
            }
            return true;
        }
    }
}
