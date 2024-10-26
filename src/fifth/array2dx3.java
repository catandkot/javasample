package fifth;

// 다음과 같은 2차원 배열을 생성하고, 배열의 값 중에서 3의 배수에 해당하는 값이 몇 개인지를 출력하는 프로그램을 작성하시오.

public class array2dx3 {
    public static void main(String[] args) {
        int[][] array = {{28,33,36,7},{56,66,44,20},{88,7,21,44},{33,2,643,4}};
        // 2차원 배열을 만들고 값을 대입합니다.

        int count=0;
        // 셈을 위한 변수를 만들어줍니다.
        for (int i = 0; i < array.length; i++) {
            // 변수의 세로 길이만큼 반복합니다.
            for (int j = 0; j < array[i].length; j++) {
                // 변수의 가로 길이만큼 반복합니다.
                if (array[i][j]%3==0) {
                    count++;
                    // 만약 세로줄 i와 가로줄 j번에 위치한 값이 3으로 나눠떨어진다면 변수를 더합니다.
                }
            }
        }
        System.out.println("3의 배수는 "+count+"개 입니다.");
        // 계산 후 결과를 출력합니다.
    }
}
