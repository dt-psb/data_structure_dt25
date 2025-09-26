package week04;


public class p04_class {
    public static void main(String[] args) {
        Circle pancake;
        pancake = new Circle(5,"asdfadsf"); // new 생성자를 호출해야 객체 생성됨
        System.out.println("팬케이크 이름은 : "+pancake.name);
        System.out.println("팬케이크 크기는 : " +pancake.getArea());

        System.out.println();

        Circle pizza = new Circle(15,"하와이안 피자");
        System.out.println(pizza.name+"의 크기는 "+ pizza.getArea() );

        Circle asdfasdf = new Circle();
        System.out.println(asdfasdf);
        System.out.println(pancake);
    }
}
