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
