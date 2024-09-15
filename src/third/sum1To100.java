package third;

// 5주차 과제 5번.
// 5.	1부터 100까지의 합을 구하여 다음과 같이 출력하는 프로그램을 do-while 반복문을 이용하여 작성하시오. 10을 기준으로 합계를 출력한다.

public class sum1To100 {
    public static void main(String[] args) {
        int count=1,sum=0;
        do {
            sum+=count;
            if(count%10==0){
                System.out.println("1 - "+count+" : "+sum);
            }
            count++;
        } while(count<=100);
    }
}
