package fifth;
import java.util.Arrays;

public class arrayMerge {
    public static void main(String[] args) {
        int [][] oneArray = {{7,9,4,7,2},{3,4,6,7,2}};
        int [][] twoArray = {{3,1,4,8,0},{3,5,6,9,1}};
        int [][] sumArray = new int[2][5];
        // 1번과 2번 배열, 그리고 더한값을 저장할 배열을 만들어줍니다.

        for (int i = 0; i < sumArray.length; i++) {
            // 변수의 세로 길이만큼 반복합니다.
            for (int j = 0; j < sumArray[i].length; j++) {
                // 변수의 가로 길이만큼 반복합니다.
                sumArray[i][j] = oneArray[i][j] + twoArray[i][j];
                }
            }
        System.out.println(Arrays.deepToString(sumArray));
        // 값이 더해진 배열의 값을 출력합니다.
        }
}
