package fifth;

// 2. 다음과 같은 배열을 프로그램 실행 시 생성하고 가장 큰 값과 가장 작은 값을 제외한
// 나머지 값의 합과 평균을 구하여 출력하는 프로그램을 작성하시오.

public class arraySumAvg {
    public static void main(String[] args) {
        int someArray[] = {234,44,89,678,55,785,66,88};
        int maxVal=someArray[0];
        int minVal=someArray[0];
        int sum=0;

        for (int i=0;i<someArray.length;i++){
            if (someArray[i]>maxVal){
                maxVal=someArray[i];
            }
            if (someArray[i]<minVal){
                minVal=someArray[i];
            }
            sum+=someArray[i];
        }

        sum-=maxVal;
        sum-=minVal;

        double avg=sum/(double)(someArray.length-2);
        System.out.println("가장 큰 값과 작은 값을 제외한 합은 : "+sum);
        System.out.println("가장 큰 값과 작은 값을 제외한 평균은 : "+avg);
        }
}
