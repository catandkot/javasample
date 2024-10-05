package first;
// 3주차 과제 5번, "한 사람당 8000원인 영화관에서 10명 이상일 경우 10%, 20명 이상일 경우 20%를 할인해 주고 있다. 사람 수를 입력 받아 지불해야 하는 총 비용을 출력하는 프로그램을 작성하시오."
import java.util.Scanner;
public class moviePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstPrice, people, finalPrice, printPercent;
        // 나눗셈을 하기 위해 double 변수를 생성해줍니다.
        System.out.println("인원 수를 입력해주십시오.");
        people = sc.nextDouble();
        // 인원 수 입력을 위해 메시지를 표시하고, 입력값을 people 변수에 저장합니다.
        firstPrice = people*8000;
        // 할인 전 값을 인원수에 8000을 곱한 값으로 설정합니다.
        if (people>=20) {
            finalPrice = firstPrice*0.8;
            printPercent = 20;
            // 만약 20명 이상일 경우 20퍼센트 할인을 위해 0.8배를 곱해주고, 20퍼센트 할인을 출력합니다.
        } else if (people>=10) {
            finalPrice = firstPrice*0.9;
            printPercent = 10;
            // 만약 20명 미만 10명 이상일 경우 10퍼센트 할인을 위해 0.9배를 곱해주고, 10퍼센트 할인을 출력합니다.
        } else {
            finalPrice = firstPrice;
            printPercent = 0;
            // 그 외의 경우는 곱하기를 하지 않으며 할인율를 0으로 합니다.
        }
        System.out.println("사람 수 : "+people+"명");
        System.out.println("총 비용("+printPercent+"%할인 적용) : "+finalPrice);
        // 입력된 사람 인원 수와 총 비용을 출력해줍니다.
    }
}
