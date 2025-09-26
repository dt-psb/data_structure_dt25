package week02;

public class p03_basic {
    public static void main(String[] args){
        int x= 9;
        int y= 22;
        int result = x<y ? (y-x) : (x-y);
        System.out.println(result);
        System.out.println();
        int number = 3699;
        int hour = number / 3600;
        int minute = (number%3600) / 60;
        int second = (number%60);
        System.out.println(hour+"시간 "+minute+"분 "+second+"초");


    }
}
