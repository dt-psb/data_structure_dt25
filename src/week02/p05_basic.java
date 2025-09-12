package week02;

import java.util.Scanner;

public class p05_basic {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if (number%2==0){
        System.out.println("짝수");
    }
    else{
        System.out.println("홀수");
    }
    
    int steps = scanner.nextInt();
    if (steps>10000){
        System.out.println("목표 달성");
    }
    
    int number3 = scanner.nextInt();
    if (number3%3==0){
        System.out.println("3의 배수입니다");
    }
    
    int number4 = scanner.nextInt();
    if((number4%15==0) && (number4>=15)){
        System.out.println("3과 5의 공배수입니다");
    }
    }
}
