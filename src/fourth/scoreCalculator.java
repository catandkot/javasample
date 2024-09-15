package fourth;
import java.util.Scanner;

// 6주차 과제 2번.
// 반복적으로 3과목의 성적을 입력 받아 총점과 평균을 출력하는 프로그램을 for문을 사용하여 작성하시오.
// 3과목의 점수가 모두 0점일 경우 프로그램은 현재까지의 처리 인원을 출력하고 프로그램을 종료한다.

public class scoreCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1,score2,score3,sum,count=1;
        do {
            System.out.println("3개 과목의 성적을 입력해주십시오.");
            score1 = sc.nextInt();
            score2 = sc.nextInt();
            score3 = sc.nextInt();
            sum = score1 + score2 + score3;
            if (score1!=0 && score2!=0 && score3!=0) {
                System.out.println(count+"번 학생 : 총점 "+sum+"점, 평균 "+sum/3+"점 ");
                count++;
            }
        } while (score1!=0 && score2!=0 && score3!=0);
        count--;
        System.out.println("총 "+count+"명을 성적 처리하였습니다.");
    }
}
