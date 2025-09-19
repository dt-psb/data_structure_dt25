package week03;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class p05_file {
    public static void main(String[] args) throws IOException {
//        File rf = new File("input_text.txt");
//        Scanner sc = new Scanner(rf);
//        int sum=0;
//        int num=sc.nextInt();
//        System.out.println("파일 첫번째 값: "+num);
//        for(int i =0 ; i<num ; ++i){
//            int b = sc.nextInt();
//            sum+=b;
//
//        }
//
//        System.out.println("합계: "+sum);

//        // 갯수를 알지 못할 때
//        Scanner sc = new Scanner(new File("input_text.txt"));
//
//        int sum = 0;
//        while(sc.hasNextInt()){
//            sum+=sc.nextInt();
//        }
//        System.out.println("합계 : "+sum);

        Scanner sc = new Scanner(new File("two.txt"));

        int num1,num2;
        int sum=0;
        while(sc.hasNextInt()){
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            sum+=(num1- num2);
        }
        System.out.println("합계 : "+sum);

        File of = new File("output_text.txt");
        FileWriter fw = new FileWriter(of);
        fw.write("합계 : "+sum);
        fw.close();
    }
}
