import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Point pt1 = new Point();
        System.out.println("Enter coordinates of Point 1");
        pt1.x = in.nextDouble();
        pt1.y = in.nextDouble();

        Point pt2 = new Point();
        System.out.println("Enter coordinates of Point 2");
        pt2.x = in.nextDouble();
        pt2.y = in.nextDouble();

        double distance = Calc.distance(pt1,pt2);
        System.out.println("Distance between two points=" + distance);
    }
}