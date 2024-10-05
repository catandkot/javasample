package fifth;

// 다음과 같은 배열을 프로그램 실행 시 생성하고 가장 큰 값과 가장 작은 값을 구하여 출력하는 프로그램을 작성하시오.
//
//[ 배열 : 234 89 678 55 785 66 ]

public class compareArray {
    public static void main(String[] args){
        int [] something = {234, 89, 678, 55, 785, 66};
        int maxval=something[0];
        int minval=something[0];

        for (int i=1;i<something.length;i++){
            if (something[i]>maxval){
                maxval=something[i];
            }
            if (something[i]<minval){
                minval=something[i];
            }
        }
        System.out.println("가장 큰 값 : "+maxval);
        System.out.println("가장 작은 값 : "+minval);
    }
}
