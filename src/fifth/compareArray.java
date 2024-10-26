package fifth;

// 다음과 같은 배열을 프로그램 실행 시 생성하고 가장 큰 값과 가장 작은 값을 구하여 출력하는 프로그램을 작성하시오.
//
//[ 배열 : 234 89 678 55 785 66 ]

public class compareArray {
    public static void main(String[] args){
        int [] array = {234, 89, 678, 55, 785, 66};
        int maxval=array[0];
        int minval=array[0];
        // 배열과 최댓값, 최솟값을 저장할 변수를 만들어줍니다.

        for (int i=1;i<array.length;i++){
            if (array[i]>maxval){
                maxval=array[i];
                // 배열의 i번째 값과 현재 변수의 값을 비교해, 변수의 값이 크다면 최대값 변수에 저장합니다.
            }
            if (array[i]<minval){
                minval=array[i];
                // 배열의 i번째 값과 현재 변수의 값을 비교해, 변수의 값이 작다면 최솟값 변수에 저장합니다.
            }
        }
        System.out.println("가장 큰 값 : "+maxval);
        System.out.println("가장 작은 값 : "+minval);
        // 최댓값과 최솟값을 각각 출력해줍니다.
    }
}
