// Java Program by Alex Bledsoe, 04/06/2017
class MySquare {
    private double sideLength;

    double getArea() {
        return sideLength * sideLength;
    }

    double getSideLength() {
        return sideLength;
    }

    void setSideLength(double l) {
        sideLength = l;
    }
}