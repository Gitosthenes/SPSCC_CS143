// Java Program by Alex Bledsoe, 04/06/2017
public class ClassTest {
    public static void main(String[] args) {
        MySquare X = new MySquare();
        MySquare Y = new MySquare();
        MySquare A = new MySquare();
        MySquare B = new MySquare();
        MySquare C = new MySquare();
        X.setSideLength(5.0);
        Y.setSideLength(3.5);
        A.setSideLength(45.0);
        B.setSideLength(52.0);
        C.setSideLength(13.5);
        System.out.println(
                "A square with sides of length " + X.getSideLength() +
                        " has area " + X.getArea() + ".");
        System.out.println(
                "A square with sides of length " + Y.getSideLength() +
                        " has area " + Y.getArea() + ".");
        System.out.println(
                "A square with sides of length " + A.getSideLength() +
                        " has area " + A.getArea() + ".");
        System.out.println(
                "A square with sides of length " + B.getSideLength() +
                        " has area " + B.getArea() + ".");
        System.out.println(
                "A square with sides of length " + C.getSideLength() +
                        " has area " + C.getArea() + ".");

    }
}
