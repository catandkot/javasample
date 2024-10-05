package second;
// 4주차 과제 5번.
// 마트에서 구입한 물건 값과 구입 시간을 입력 받아 실제 지불한 금액을 출력하는 프로그램을 작성하시오. 마트는 시간대별로 할인율을 다르게 적용한다.
//[ 오전 12시 이전 : 구입 금액의 5% 할인, 오전 12시 이후(12시 포함) : 구입 금액의 2.5% 할인 ]

import java.util.Scanner;
public class timesalecheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time;
        double origPrice, discRate, discPrice;
        System.out.print("구입 시간 : ");
        time = sc.nextInt();
        if(time<=11) discRate=0.95;
        else discRate=0.975;
        System.out.print("총 구입 금액 : ");
        origPrice = sc.nextDouble();
        discPrice = origPrice*discRate;
        // 출력 깔끔하게 정렬할필요 있음
        System.out.printf("실제 지불 금액 : %f \r\n",discPrice);
        sc.close();
    }

}
