package first;

import java.util.Scanner;
public class movieprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstPrice, people, finalPrice, printPercent;
        System.out.println("인원 수를 입력해주십시오.");
        people = sc.nextDouble();
        firstPrice = people*8000;
        if (people>=20) {
            finalPrice = firstPrice*0.8;
            printPercent = 20;
        } else if (people>=10) {
            finalPrice = firstPrice*0.9;
            printPercent = 10;
        } else {
            finalPrice = firstPrice;
            printPercent = 0;
        }
        System.out.println("사람 수 : "+people+"명");
        System.out.println("총 비용("+printPercent+"%할인 적용) : "+finalPrice);
    }
}