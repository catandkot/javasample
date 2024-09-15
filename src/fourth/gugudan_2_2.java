package fourth;

// 6주차 과제 3번.
// 구구단 2단을 다음과 같이 출력하는 프로그램을 for 반복문을 사용하여 작성하시오.
//** 2단 **
//2 * 1 = 2
//2  3 = 6
//2 * 5 = 10
//2 * 7 = 14
//2 * 9 = 18

public class gugudan_2_2 {
    public static void main(String[] args) {
        System.out.println("** 2단 **");
        for (int count=1; count<=9; count+=2) {
            System.out.println("2 * "+count+" = "+count*2);
        }
    }
}
