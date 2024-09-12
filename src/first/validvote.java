package first;
// 3주치 과제 3번, "유권자 수와 투표자 수를 입력 받아 투표율이 50% 이상인 경우 “유효 투표입니다”를 출력하는 프로그램을 작성하시오."
import java.util.Scanner;
public class validvote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double voter, totalVoter, calcResult;
        System.out.println("유권자 수를 입력해주십시오.");
        totalVoter = in.nextDouble();
        System.out.println("투표자 수를 입력해주십시오.");
        voter = in.nextDouble();
        calcResult = (voter / totalVoter)*100;
        if(calcResult>50) {
            System.out.println("유효 투표입니다.");
        }
        // 결과 확인 필요시 주석 해제처리 System.out.println("결과는 " + calcResult);
    }
}
