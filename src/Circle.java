public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * java.lang.Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * java.lang.Math.PI;
    }

    public String toString() {
        return String.format("Circle[%s, radius=%.2f]", super.toString(), this.radius);
    }

    public Circle clone() {
        return new Circle(this.getRadius(), this.getColor(), this.isFilled());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }

        Circle circle = (Circle) obj;
        boolean isRadiusEqual = circle.radius == this.radius;
        return isRadiusEqual && super.equals(obj);
    }
}
