package fourth;

// 6주차 과제 5번.
// 다음과 같이 출력하는 프로그램을 while문과 for문을 사용하여 작성하시오.
// { 1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25 }

public class printNum {
    public static void main(String[] args) {
        int count=1;
        do {
            if(count%5==0){
                System.out.println(count);
            } else {
                System.out.print(count+" ");
            }
            count++;
        } while(count<=25);
    }
}
