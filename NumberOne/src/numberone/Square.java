package numberone;

public class Square extends Rectangle {

    public Square() {
        super();
        double side = 1.0;
    }

    public Square(double side) {
        super(side, side);
        side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        side = side;
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
