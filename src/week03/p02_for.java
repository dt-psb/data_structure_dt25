package week03;

import java.util.Scanner;

public class p02_for {
    public static void main(String[] args){

        //for문 사용방법
        //for(초기화 ; 조건식 ; 반복후 처리){
        //      반복하고 싶은코드1
        //      반복하고 싶은코드2
        //}

//        int a=0;
//        for(int i =1; i<100; i++){
//            a+=i;
//            System.out.print(i+ " + ");
//        }
//        a+=100;
//        System.out.println("100 = " + a);
//
//        System.out.println();
//
//        int n;
//        long fact;
//        Scanner scanner = new Scanner(System.in);
//        n= scanner.nextInt();
//        fact=1;
//        for(int i =n; i>1;i--){
//            fact*=i;
//            System.out.print(i + " * ");
//        }
//        System.out.println("1 = "+fact);



        int a=0;
        for(int i =1; i<101; i++){
            a+=i;
            if(i<100){
                System.out.print(i+ " + ");
            }
            else{
                System.out.print("100 = "+ a);
            }
        }

        System.out.println();

        int n;
        long fact;
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        fact=1;
        for(int i = n; i>1;i--) {
            fact *= i;
            System.out.print(i + " * ");
        }
            System.out.print("1 = " + fact);

    }
}

