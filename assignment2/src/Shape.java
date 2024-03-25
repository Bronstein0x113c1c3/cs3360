public abstract class Shape {
    protected String color;
    protected Boolean filled;

    // constructor
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // get and set
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled() {
        this.filled = true;
    }

    abstract double getArea();

    abstract double getPerimeter();

    // for sout
    public String toString() {
        return String.format("Shape[color=%s, filled=%s]", this.color, this.filled);
    }

    public abstract Shape clone();

    public abstract boolean equals(Object o);
}
