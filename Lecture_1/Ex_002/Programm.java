package Lecture_1.Ex_002;

public class Programm {
    

    // static double distance (int x1, int y1, int x2, int y2 ) {
    //     return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    // }
    
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(20);
        // a.x = 0;
        // a.y = 2;
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a);

        Point2D b = new Point2D(10);
        //b.x = 0;
        //b.y = 10;
        System.out.println(b);

        //System.out.println(distance(a, b));

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
