package week04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class p02_fileData {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sentence.txt"));
////        System.out.println(sc.next());
////        System.out.println(sc.nextLine());
//        while(sc.hasNext()){
//            String s = sc.nextLine();
//            String sArr[] = new String[]{Arrays.toString(s.split(" "))}; // " " 공백 단위로 문자열 s를 잘라서 배열에 담아줌
//            for( int i =0 ; i<sArr.length; ++i){
//                System.out.print(sArr[i]+",");
//            }
//        }
        sc.close();
        sc = new Scanner(new File("numbers.txt"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            int sum=0;
            String sArr[] = s.split(" "); // " " 공백 단위로 문자열 s를 잘라서 배열에 담아줌
            for( int i =0 ; i<sArr.length; ++i){
                sum += Integer.parseInt(sArr[i]);
                System.out.print(sArr[i]+",");
            }
            System.out.println("   --> 합계 : " + sum);
        }
        sc.close();
    }
}
