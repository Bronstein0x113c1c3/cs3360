public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        return String.format("Rectangle[%s, width=%.2f, length=%.2f]", super.toString(), this.width, this.length);
    }

    public Rectangle clone() {
        return new Rectangle(this.getWidth(), this.getLength(), this.getColor(), this.isFilled());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;

        boolean isLengthEqual = rectangle.length == this.length;
        boolean isWidthEqual = rectangle.width == this.width;

        return isLengthEqual && isWidthEqual && super.equals(obj);
    }
}
