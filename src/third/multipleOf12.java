package third;
import java.util.Scanner;

// 사용자로부터 단을 입력 받아 그 단에 해당되는 구구단을
// 다음과 같은 형태로 출력하는 프로그램을 do-while문을 사용하여 작성하시오.

// 사용자 입력 : 12
//** 12단 **
//8 * 12 = 96
//6 * 12 = 72
//4 * 12 = 48
//2 * 12 = 24

public class multipleOf12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=8, input;
        System.out.println("값을 입력해주십시오. : ");
        input = sc.nextInt();
        System.out.println("** "+input+"단 **");
        do {
            System.out.println(count+" * "+input+" = "+count*input);
            count-=2;
        } while (count!=0);
    }
}
