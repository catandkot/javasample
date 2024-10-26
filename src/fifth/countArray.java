package fifth;
import java.util.HashMap;


//  다음과 같은 2차원 배열에서 같은 숫자가 몇 번 나오는지를 출력하는 프로그램을 작성하시오. 단, 숫자는 한 번만 출력되어야 한다.
//  [[7,9,4,7,2] [3,4,6,7,2] [3,2,6,9,8]]
//
//  { 4의 개수 : 2
//
//7의 개수 : 3
//
//3의 개수 : 2
//
//2의 개수 : 3
//
//6의 개수 : 2
//
//9의 개수 : 2
//
//8의 개수 : 1 }

public class countArray {
    public static void main(String[] args) {
        int [][] array = new int [2][4];
        // 배열을 생성해줍니다.

        array = new int[][]{{7,9,4,7,2},{3,4,6,7,2},{3,2,6,9,8}};
        //배열에 값을 대입합니다.

        HashMap<Integer, Integer> countMap = new HashMap<>();
        // hashmap를 통해 어떤 숫자가 몇개 있는지를 저장하기 위해 초기화해줍니다.

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num = array[i][j];
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }
        // 반복문을 통해 배열의 i열 j행에 있는 값을 읽고, 해당 값을 HashMap상에 대입합니다.

        for (Integer key : countMap.keySet()) {
            System.out.println(key + "의 개수 : " + countMap.get(key));
        }
        // HashMap을 읽고, 어떤 값이 몇번 있는지를 출력합니다.
    }
}
