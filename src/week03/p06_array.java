package week03;

public class p06_array {
    public static void main(String[] args) {

        int arr [];
        arr = new int[5]; // 배열 생성

        arr[0] =99;
        arr[1] = 4;
        arr[4] =77;

        for (int i =0 ; i<arr.length ; ++i){
            System.out.println(i+"번째 값 arr["+i+"]=" + arr[i]);
        }
        boolean barr [] = new boolean[3];
        System.out.println("첫번째 칸:" + barr[0]);

        String sarr [];
        sarr = new String[4];
        System.out.println("첫번째 칸:" + sarr[0]);
    }
}
