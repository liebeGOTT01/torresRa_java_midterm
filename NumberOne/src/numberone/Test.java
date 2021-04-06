package numberone;

public class Test {

    public static void main(String[] args) {

        Shape shape = new Shape("green", false);
        System.out.println(shape.toString());

        Circle circle = new Circle(2.0);
        System.out.println(circle.toString());

        Rectangle rect = new Rectangle(1, 2);
        System.out.println(rect.toString());

        Square square = new Square();
        System.out.println(square.toString());

    }

}
