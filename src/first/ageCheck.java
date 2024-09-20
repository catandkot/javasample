package first;
// first 디렉토리(패키지) 내에 있기에 package first를 지정해줍니다.

// 3주차 과제 7번, "나이를 입력 받아 입력된 나이가 19세 미만이면 “미성년자입니다”, 19세이면 “19세입니다”를, 19세보다 많으면 “성인입니다”를 출력하는 프로그램을 작성하시오."

import java.util.Scanner;
// 입력을 받기 위한 Scanner를 사용하기 위해 import로 불러들입니다.

public class ageCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner 클래스의 객체를 생성해줍니다.
        int age;
        // 정수형 변수 age를 생성해줍니다.
        System.out.println("나이를 입력해주십시오.");
        // 화면에 해당 문자를 출력합니다.
        age = sc.nextInt();
        // 입력된 숫자를 정수형으로 받아 age 변수에 대입합니다.
        if (age<19) {
            System.out.println("미성년자입니다.");
            // 만약 나이가 19세 미만이라면 미성년자를 출력합니다.
        } else if (age == 19) {
            System.out.println("19세입니다.");
            // 만약 나이가 19세라면 19세라고 출력합니다.
        } else {
            System.out.println("성인입니다.");
            // 만약 나이가 19세를 초과한다면 성인으로 출력합니다.
        }
    }
}
