public abstract class Shape implements Cloneable{
    protected String color = "red";
    protected Boolean filled = true;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String toString() {
        return String.format("Shape[color=%s, filled=%s]", this.color, this.filled);
    }

    public abstract Shape clone();

    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Shape)) {
            return false;
        }
        
        Shape shape = (Shape) obj;
        boolean isSameColor = shape.color == this.color;
        boolean isSameFilled = shape.filled == this.filled;

        return isSameColor && isSameFilled;
    }
}
