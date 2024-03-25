public class App {
    public static void main(String[] args) throws Exception {
        // Shape s = new Shape();
        Circle c = new Circle(1.3, "blue", false);
        Rectangle r = new Rectangle(1.3, 2.8, "yellow", true);

        Square s = new Square(1.7, "green", true);
        System.out.println("this is the circle: " + c);
        System.out.println("this is the rectangle: " + r);
        System.out.println("this is the square: " + s);
        Circle c1 = c.clone();
        c.setColor("brown");
        System.out.println("this is the circle: " + c);
        System.out.println("this is the circle: " + c1);
        System.out.println(c.equals(s));
    }
}
