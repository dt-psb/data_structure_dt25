package week04;

public class p03_method {
    // 줄을 출력하는 함수, 파라미터 없음, 반환값 없음
    public static void printLine(){
        System.out.println("=======================");
    }
    public static int addNum(int a, int b){
        int sum =  a+ b;
        return sum;
    }
    public static int addNum(int a, int b, int c){
        return a+b+c;
    }
    public static String addString(String a, String b){
        return a+b;
    }
    public static int add10 (int a){
        a+=10;
        return a;
    }

    public static void printArr( int arr[]){
        for(int i =0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static double cm2in(int n){
        return n/2.54;
    }

    public static int findElement(double num, double arr[]){
        for(int i =0 ; i<arr.length ;++i){
            if (arr[i]==num) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
//        printLine();
//        System.out.println("addNum(213,123) = " + addNum(213,123));
//        System.out.println("addNum(213,123,5555) = " + addNum(213,123,5555));
//        System.out.println(addString("asdfasdf","wfew wer"));
//        int n =-2;
//        System.out.println("add10(n) = "+add10(n));
//        int  intArr [] = {2,5,4,83,1,53,1,86,15,3};
//        printArr(intArr);

        System.out.println(cm2in(100));
        System.out.println(String.format("%.4f",3859.15851984984));
        System.out.println(String.format("%.4f",cm2in(100)));
        double doubleArr[]= {5.1,100.4,4.9,0.7};
        System.out.println(findElement(999,doubleArr));
    }
}
