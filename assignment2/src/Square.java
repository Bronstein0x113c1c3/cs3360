public class Square extends Rectangle {
    // constructors
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // getter setter
    public double getSide() {
        return this.getSide();
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    // inheritance
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

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Square)) {
            return false;
        }
        Square s = (Square) o;
        return s.getLength() == this.getLength();
    }
}
