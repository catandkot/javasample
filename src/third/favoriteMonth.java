package third;
import java.util.Scanner;

public class favoriteMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("가장 좋아하는 월은? (종료 : 0)");
        System.out.println("=======================");
        int month = sc.nextInt();
        do {
            switch (month) {
                case 3: case 4: case 5:
                    System.out.println("****** "+month+" ******");
                    System.out.println(month+"월은 봄에 해당됩니다.");
                    break;
                case 6: case 7: case 8:
                    System.out.println("****** "+month+" ******");
                    System.out.println(month+"월은 여름에 해당됩니다.");
                    break;
                case 9: case 10: case 11:
                    System.out.println("****** "+month+" ******");
                    System.out.println(month+"월은 가을에 해당됩니다.");
                    break;
                case 12: case 1: case 2:
                    System.out.println("****** "+month+" ******");
                    System.out.println(month+"월은 겨울에 해당됩니다.");
                    break;
                default:
                    break;
            }
            month = sc.nextInt();
        } while (month != 0);
    }
}
