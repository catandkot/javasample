package fifth;
import java.util.Arrays;

// 3. 다음과 같은 10개의 숫자 배열을 생성하고 배열의 각 데이터가 한 칸씩 왼쪽으로 이동하여 다시 저장되도록 하는 프로그램을 작성하시오.
// 단, 초기 배열의 가장 왼쪽 데이터는 가장 오른쪽으로 이동한다. 초기 배열 값과 이동 후 배열 값을 출력하시오.
// [ 배열 : 33 2 189 72 7 91 5 14 17 9 ]
//
//{ 초기 배열 값 : 33 2 189 72 7 91 5 14 17 9
//이동 후 배열 값 : 2 189 72 7 91 5 14 17 9 33 }

public class shiftArray {
    public static void main(String[] args) {
        int [] toSort = {33, 2, 189, 72, 7, 91, 5, 14, 17, 9};
        // 배열을 생성해줍니다.
        int shiftTemp = toSort[0];
        // 배열의 첫번째 값을 임시 변수에 저장해줍니다.

        System.out.println("초기 배열 값 : "+Arrays.toString(toSort));

        for (int i = 1; i < toSort.length; i++) {
            toSort[i-1] = toSort[i];
            // 배열의 길이만큼 배열을 1칸씩 왼쪽으로 옮깁니다.
        }
        toSort[toSort.length-1] = shiftTemp;
        // 배열의 첫번째 값을 다시 배열의 마지막 위치에 삽입해줍니다.

        System.out.println("이동 후 배열 값 : "+Arrays.toString(toSort));
        // 배열을 출력합니다.


    }
}
