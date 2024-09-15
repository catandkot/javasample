package third;

// 5주차 과제 3번 문제.
// 구구단 2단을 다음과 같이 출력하는 프로그램을 반복문을 사용하여 작성하시오.
// { ** 2단 **
//
//2 * 1 = 2
//
//2 * 3 = 6
//
//2 * 5 = 10
//
//2 * 7 = 14
//
//2 * 8 = 16 }

public class gugudan_2 {
    public static void main(String[] args) {
        int count=1;
        System.out.println("{ ** 2단 **");
        while (count<8){
            System.out.println("2 * "+count+" = "+2*count);
            count+=2;
        }
        count-=1;
        System.out.println("2 * "+count+" = "+2*count);
    }
}
