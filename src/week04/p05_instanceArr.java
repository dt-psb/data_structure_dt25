package week04;

public class p05_instanceArr {
    public static void main(String[] args) {
        Circle cookie = new Circle(3,"초코쿠키");
        System.out.println(cookie);

        Circle cookies[] = new Circle[5];
        System.out.println(cookies[0]);
        cookies[0] = new Circle(3, "초코쿠키");
        cookies[1] = new Circle(4, "김치찌개쿠키");
        cookies[2] = new Circle(135, "민트쿠키");
        cookies[3] = new Circle(332, "빨간쿠키");
        cookies[4] = new Circle(2, "얌얌쿠키");

        for(int i =0; i<cookies.length; ++i){
            System.out.print(cookies[i]+" ");
        }
        System.out.println();
        String names[] = {"초코","바닐라","사일런트솔트","맨톨","치즈"};
        Circle macarons[]=new Circle[names.length];
        for (int i =0; i<macarons.length; ++i){
            macarons[i] = new Circle(3,names[i]);
        }
        for(int i =0; i<macarons.length; ++i){
            System.out.print(macarons[i]+" ");
        }
        System.out.println();

    }
}
