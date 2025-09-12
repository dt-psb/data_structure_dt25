package week02;

public class p01_basic {
    public static void main(String[] args){
        System.out.println("Hello, Data Structure!");
        //1. 숫자형;
        int myInteger;// 타입 식별자 --> 변수를 선언
        myInteger = 50;
        long bigInteger = 359205959302L;
        float myFloat = 34.5930f;
        double myDouble = 39.39525;
        System.out.println("myFloat = " + myFloat);
        System.out.println("my Integer = " + myInteger);
        System.out.println("big Integer = " + bigInteger);
        System.out.println("myDouble = " +myDouble);
        System.out.println("myFloat + myDouble = " +(myFloat + myDouble) + "\n");

        //2. 논리값
        boolean like_green = true;
        boolean like_yellow = false;
        System.out.println("초록색을 좋아하나요? " + like_green);
        System.out.println("노란색을 좋아하나요? " + like_yellow + "\n");

        //3. 문자
        char StudentGrade = 'A';
        System.out.println("학점은? "+StudentGrade+"\n");

        int width=100, height=200, radius = 4;
        final double pi=3.14;
        int size = width*height, perimeter=(width+height)*2;
        double circle_size=pi*radius*radius, round = 2*pi*radius;
        System.out.println("사각형의 둘레는 "+perimeter+"이고 면적은 "+size+ "입니다.");
        System.out.println("원의 둘레는 "+round+"이고 면적은 "+circle_size+"입니다.");
    }
}
