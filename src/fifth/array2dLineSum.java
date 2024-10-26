package fifth;

// 5번 문제의 배열을 이용하여 각 열(세로줄)의 합을 출력하는 프로그램을 작성하시오.

public class array2dLineSum {
    public static void main(String[] args){
            int[][] array = {{28,33,36,7},{56,66,44,20},{88,7,21,44},{33,2,643,4}};
            // 배열을 생성해줍니다.


            for (int j = 0; j < array[i].length; j++) {
                    // 변수의 가로 길이만큼 반복합니다.
                    for (int i = 0; i < array.length; i++) {
                            // 변수의 세로 길이만큼 반복합니다.

                    }
            }


            int firstSum, secondSum, thirdSum, fourthSum;
            firstSum = array[0][0]+array[1][0]+array[2][0]+array[3][0];
            secondSum = array[0][1]+array[1][1]+array[2][1]+array[3][1];
            thirdSum = array[0][2]+array[1][2]+array[2][2]+array[3][2];
            fourthSum = array[0][3]+array[1][3]+array[2][3]+array[3][3];
            // n번 줄 변수의 합을 각 변수에 저장합니다.

            System.out.println("1열의 합계 : "+firstSum);
            System.out.println("2열의 합계 : "+secondSum);
            System.out.println("3열의 합계 : "+thirdSum);
            System.out.println("4열의 합계 : "+fourthSum);
            // 저장된 합 값을 출력합니다.
            }
        }
