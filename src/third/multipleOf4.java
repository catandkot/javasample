package third;

// 5주차 과제 1번.
// 1부터 100까지의 수 중에서 4의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.

public class multipleOf4 {
    public static void main(String[] args) {
        int count,result=0;
        for (count = 1; count <= 100; count++) {
            if (count%4==0){
                result+=count;
            }
        }
        System.out.println("1부터 100중 4의 배수를 모두 더한 값은 "+result+" 입니다.");
    }
}
