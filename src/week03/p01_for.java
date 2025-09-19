package week03;

public class p01_for {
    public static void main(String[] args){

        //for문 사용방법
        //for(초기화 ; 조건식 ; 반복후 처리){
        //      반복하고 싶은코드1
        //      반복하고 싶은코드2
        //}

        for(int i=0 ; i<10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i =1 ; i<=10 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int b=10; b>0; b--){
            System.out.print(b + " ");
        }
        System.out.println();
        //별표10개 출력
        for(int c=0; c<10; c++){
            System.out.print(" * ");
        }
    }
}
