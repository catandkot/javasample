package first;

// 3주차 과제 11번, "상품의 개수와 단가를 입력 받아 총 금액을 계산하여 출력하시오. 단, 상품의 개수가 100-199 사이이면 8%, 200-299 사이이면 15%, 300개 이상이면 20%의 할인 금액을 적용한다.
// 100개 미만이면 할인 금액을 적용하지 않는다."
import java.util.Scanner;
public class priceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count, price, finalPrice;
        // 개수와 단가와 최종 값을 위한 변수를 생성해줍니다.
        System.out.println("상품의 개수를 입력해주십시오.");
        count = sc.nextInt();
        System.out.println("상품의 단가를 입력해주십시오.");
        price = sc.nextInt();
        // 상품의 개수와 단가를 입력받아 각각 변수에 대입합니다.
        if (count>=300) {
            finalPrice=count*price*0.8;
        } else if (200<=count & 299>=count) {
            finalPrice=count*price*0.85;
        } else if (100<=count & 199>=count) {
            finalPrice=count*price*0.92;
        } else {
            finalPrice=count*price;
        }
        // 만약 300개 이상일 시 20프로를, 200~299개일시 15프로를, 100~199개일시 8프로를,
        // 그 이외의 경우 할인을 적용하지 않고, 계산값을 최종값 변수에 대입합니다.
        System.out.println("총 금액 : "+finalPrice);
        // 최종 값을 출력합니다.
    }
}
