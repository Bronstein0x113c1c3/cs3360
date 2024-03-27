public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();   // or getWidth()
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    public String toString() {
        return String.format("Square[%s]", super.toString());
    }

    public Square clone() {
        return new Square(this.getSide(), this.getColor(), this.isFilled());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Square)) {
            return false;
        }

        return super.equals(obj);
    }
}
