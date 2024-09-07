import java.util.Scanner;
public class flightattadent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score,gender;
        System.out.println("성별을 입력해주십시오. (여자면 0 남자면 1))");
        gender = sc.nextInt();
        System.out.println("토익 성적을 입력해주십시오.");
        score = sc.nextInt();
        if((gender==0&score>=700)||(gender==1&score>=800)) {
            System.out.println("항공 승무원 지원 자격 가능자입니다.");
        }
        sc.close();
    }

}
