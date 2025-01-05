//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        // use case 1
        // Calculate length of the first line
        Line line1 = new Line(new Point(1, 3), new Point(4, 6));
        double length1 = line1.calculateLength();
        System.out.println("Length of Line 1: " + length1);

        // Calculate length of the second line
        Line line2 = new Line(new Point(2, 3), new Point(5, 7));
        double length2 = line2.calculateLength();
        System.out.println("Length of Line 2: " + length2);

        // USE CASE 2: Checking equality of line's length
        if (line1.hasSameLengthAs(line2)) {
            System.out.println("Line 1 is equal to Line 2");
        } else {
            System.out.println("Line 1 is not equal to Line 2");
        }


        // Use case 3: Compare two lines
        int comparisonResult = line1.compareTo(line2);
        if (comparisonResult == 0) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2");
        } else {
            System.out.println("Line 1 is shorter than Line 2");
        }

    }
}