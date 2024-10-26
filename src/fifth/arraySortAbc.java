package fifth;
import java.util.Arrays;

// 다음과 같은 문자 배열을 프로그램 실행 시 생성하고 알파벳순(내림차순)으로 정렬하는 프로그램을 작성하시오.
//
// [ 배열 : kim park oh lim pang seo lee yang bae back ]
//
// 정렬 전 : : kim park oh lim pang seo lee yang bae back
// 정렬 후 : back bae kim lee lim oh pang park seo yang

public class arraySortAbc {
    public static void main(String[] args) {
        String[] array = {"kim", "park", "oh", "lim", "pang", "seo", "lee", "yang", "bae", "back"};
        // 먼저 배열을 생성해줍니다.
        Arrays.sort(array);
        // 배열을 영문자 순서대로 정렬해줍니다.
        System.out.println(Arrays.toString(array));
        // 정렬된 배열을 출력합니다.
    }
}
