package Lecture_1.Ex_002;

public class Point2D {
    int x, y;

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        // this.x = value;
        // this.y = value;
        this(value, value);
    }

    public Point2D() {
        this(0);
    }
    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // }

    // public Point2D(int value) {
    //     x = value;
    //     y = value;
    // }

    private String getInfo() {
        return String.format("x: %d; y: %d;", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
    // ctor
    // get; set;
    // docs
    //
}
