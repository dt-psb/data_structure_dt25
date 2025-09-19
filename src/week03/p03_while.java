package week03;

public class p03_while {
    public static void main(String[] args) {
        //while문 사용법
        //while(조건식/논리값){
        //반복할 코드
        //}

//        int i = 0;
//        while (i < 30) {
//            System.out.println(i);
//            i += 3;
//        }
//        System.out.println("\n최종 i값은? " + i);
//
//        while (i > 0) {
//            System.out.println(i);
//            i -= 2;
//        }
//        System.out.println("\n최종 i 값은? " + i);
        int i = 1;
        int a = 0;
        while (true) {
            a += i;
            if (a > 1000) {
                break;
            }
            i++;

        }
        System.out.println("\n시점은 " + i + " 합계는 " + a);

        float n = 17;
        int b =0;
        while(n>1){
            n/=2;
            b++;
        }
        System.out.println("n을 2로 나눠서 1 이하가 될 때 횟수는 "+b);
    }
}
