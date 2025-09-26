package week04;

import java.util.Scanner;

public class p01_array {
    public static void main(String[] args) {
//        int intArr[];
//        intArr = new int[5];
//        intArr[0] = 4;
//        System.out.println("0번째 원소 : "+ intArr[0]);
//        System.out.println("마지막 원소 : "+intArr[4]);
//
//        for(int i =0; i<4;++i){
//            intArr[i]+=5;//intArr[i] = intArr[i]+5;
//            System.out.print(intArr[i]+" ");
//        }
//
//        int tmpArr[] = intArr;
//        tmpArr[0] = 3;
//        System.out.println("\n"+intArr[0]);
//
//        //최대값, 최소값 찾기
//        double dArr[] = {3.4, 2.9, -0.4, -19.4, 100.2};
//        double min = dArr[0], max=dArr[0];
//
//        for (int i=1 ; i <dArr.length; ++i) {
//            min = min<dArr[i] ? min : dArr[i];
//            max = max>dArr[i] ? max : dArr[i];
//            System.out.println("현재 최대값 : " + max + " / 현재 최소값 : " + min);
//        }
//        System.out.println("최대값 : " + max + " / 최소값 : " + min);
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("숫자를 입력 해주세요 ");
        n = scanner.nextInt();

        int intArr[] = new int[n];

        for (int i =0;i<n;++i){
            System.out.print(i+"번째 숫자를 입력 해주세요 ");
            intArr[i] = scanner.nextInt();
        }
        int min = intArr[0], max=intArr[0];
        for (int i=1 ; i <intArr.length; ++i) {
            min = min<intArr[i] ? min : intArr[i];
            max = max>intArr[i] ? max : intArr[i];
        }
        System.out.println("최대값 : " + max + " / 최소값 : " + min);
    }
}
