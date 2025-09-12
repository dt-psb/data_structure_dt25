package week02;

public class p02_basic {
    public static void main(String[] args) {
      // 연산자
        //1. 산술 연산
        System.out.println("7 / 3 = "+7/3);
        System.out.println("7.0 / 3 = "+7.0/3);
        System.out.println("7 % 3 = "+7%3);
        System.out.println("7.2 % 2.5 = "+7.2%2.5+"\n");

        //2. 증감 연산
        int t= 10;
        System.out.println("t: "+t);
        System.out.println("t++: "+ t++ );//이 줄이 처리되고 난 뒤에 t 값 증가
        System.out.println("t: "+ t+"\n");
        // ++t 라고 쓸 경우, 그 줄이 처리되기 전에 t값 증가

        //3.비교연산
        System.out.println("1>=3은? " + (1>=3));
        System.out.println("1<3은? " + (1<3));
        System.out.println("1==3은? " + (1==3));
        System.out.println("a는 b보다 작은가? " + ('a'<'b'));
        System.out.println("a는 a와 같은가? " + ('a'=='a'));
        System.out.println("a는 A와 같은가? " + ('a'=='A'));
        System.out.println("a는 A보다 작은가? " + ('a'<'A'));
        System.out.println("a는 0보다 작은가? " + ('a'<'0'));
        System.out.println("a는 ㄱ보다 작은가? " + ('a'<'ㄱ')+"\n");
        // 0 < A < a < ㄱ

        //4. 논리연산
        System.out.println("!(1>3) = "+ !(1>3)); // 논리값 뒤집기
        boolean like_green = true;
        boolean like_red=false;
        System.out.println("초록색과 빨강색을 모두 좋아하는가? " + (like_red&&like_green));
        System.out.println("초록색과 빨강색 중 좋아하는 색이 있는지? " + (like_red||like_green));
        System.out.println("초록색과 빨강색에 대한 생각이 다른지? " + (like_red^like_green)+"\n");
        int x = 10;
        int y= 30;
        int z = 50;
        //y가 x와 z 사이에 있는 숫자인가?
        System.out.println("y가 x와 z 사이에 있는 숫자인가? " + (((x<y)&&(y<z))||((z<y)&&(y<x))) + "\n");

        // 5. 문자열
        String fruit1 = "Apple";
        String fruit2 = "Banana";
        String fruit3 = "Apple";
        String fruit4 = new String("Apple");
        System.out.println("fruit1==fruit3인가? " + (fruit1==fruit3));
        System.out.println("fruit1==fruit2인가? " + (fruit1==fruit2));
        System.out.println("fruit1==fruit4인가? " + (fruit1==fruit4));
        System.out.println("fruit1.equals(fruit4) " + (fruit1.equals(fruit4)));
        System.out.println("fruit1.compareTo(fruit4) " + (fruit1.compareTo(fruit4)));
        System.out.println("fruit1.compareTo(fruit2) " + (fruit1.compareTo(fruit2)));

    }
}
