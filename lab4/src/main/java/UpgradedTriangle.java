
public class UpgradedTriangle {

    public static String classifyTriangle(int side1, int side2, int side3) {
        if (!isValidTriangle(side1, side2, side3)) {
            return "INVALID";
        }

        if (side1 == side2 && side2 == side3) {
            return "EQUILATERAL";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "ISOSCELES";
        } else {
            return "SCALENE";
        }
    }

    public static double calculateArea(int side1, int side2, int side3) {
        if (!isValidTriangle(side1, side2, side3)) {
            return 0;
        }

        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    private static boolean isValidTriangle(int side1, int side2, int side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
