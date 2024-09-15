package fourth;
import java.util.Scanner;

// 6주차 과제 4번.
// ① 3 + 6 + 9 + 12 + 15 + … + N 형태로 수를 더한다. ② 하나의 숫자를 입력 받는다.
// ③ 3의 배수의 총합이 입력된 숫자를 넘었을 때의 N값과 총 합계,
// N값이 몇 번째 인지를 구하는 프로그램을 for 반복문을 사용해 작성하시오.

public class threeMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주십시오.");
        int input=sc.nextInt(),count=3,totalsum=0;
        do {
            totalsum+=count;
            count+=3;
        } while (count<input);
        System.out.println(input+"을(를) 넘었을 때의 값 : "+count);
        System.out.println(input+"을(를) 넘었을 때까지의 합 : "+totalsum);
        System.out.println(input+"을(를) 넘었을 때의 3의 몇배인가 : "+count/3);
    }
}
