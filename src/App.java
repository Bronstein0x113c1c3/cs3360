public class App {
    public static void main(String[] args) throws Exception {

        Circle circle = new Circle(1.3, "blue", false);
        Rectangle rectangle = new Rectangle(1.3, 2.8, "yellow", true);

        Square square = new Square(1.7, "green", true);

        System.out.println("============================================");
        System.out.println("Circle: " + circle);
        System.out.println();

        System.out.println("============================================");
        System.out.println("Rectangle: " + rectangle);
        System.out.println();

        System.out.println("============================================");
        System.out.println("Square: " + square);
        System.out.println();

        Circle circle_copy = circle.clone();
        circle.setColor("brown");
        System.out.println("============================================");
        System.out.println("Original Circle: " + circle);
        System.out.println("Copy Circle: " + circle_copy);
        System.out.println();

        System.out.println("============================================");
        System.out.println(circle.equals(circle_copy));
        System.out.println();
    }
}
