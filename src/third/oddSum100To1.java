package third;

// 5주차 과제 4번
// 100부터 1까지의 수 중에서 홀수의 합을 구하여 출력하는 프로그램을 do-while문을 사용하여 작성하시오.

public class oddSum100To1 {
    public static void main(String[] args) {
        int count=100,sum=0;
        do {
            if (count%2!=0){
                sum+=count;
            }
            count--;
        } while (count>0);
        System.out.println("결과값은 : "+sum);
    }
}
