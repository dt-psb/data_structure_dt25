package week03;

import java.util.Scanner;

public class p04_stream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력해주세요: ");
//
//        int num1 = scanner.nextInt();
//        System.out.print("숫자를 입력해주세요: ");
//        int num2 = scanner.nextInt();
//        System.out.println("입력받은 숫자의 합 --> " + (num1 + num2));
//
//        double num3 = scanner.nextDouble();
//        System.out.println("입력받은 실수: "+num3);
//        System.out.print("단어를 입력해주세요: ");
//        String s1=scanner.next(); 공백단위로 1번읽기
//        String s1=scanner.nextLine();
//        System.out.println("입력받은 문자열: "+s1);
        int sum=0;
        while(true) {
            System.out.print("숫자를 입력해주세요: ");
            int i = scanner.nextInt();
            if (i < 0) break;
            sum+=i;
        }
        System.out.println("합계 :  "+sum);
    }

}
