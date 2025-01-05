// UC-0: Display Welcome Message
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // use case 1
        // Calculate length of the first line
        Line line1 = new Line(new Point(1, 2), new Point(4, 6));
        double length1 = line1.calculateLength();
        System.out.println("Length of Line 1: " + length1);

        // Calculate length of the second line
        Line line2 = new Line(new Point(2, 3), new Point(5, 7));
        double length2 = line2.calculateLength();
        System.out.println("Length of Line 2: " + length2);
    }


}