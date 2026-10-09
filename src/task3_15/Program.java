package task3_15;

import java.util.Scanner;
public class Program {

    public static final Circle C1 = new Circle(-3, 3, 2.5);
    public static final Rectangle R1 = new Rectangle(-4, -1, 1, 3);
    public static final Line L1 = new Line(0, 1.5, -2);
    public static final HorizontalParabola P1 = new HorizontalParabola(4, 3, 1.0 / 3);
    public static final Parabola P2 = new Parabola(5,-2,0.14);

    public static SimpleColor getColor(double x, double y) {
        if (C1.isPointInside(x, y)) {
            if (L1.isPointAboveLine(x, y)) {
                return SimpleColor.BLUE;
            }

            if (R1.isPointInside(x, y)) {
                return SimpleColor.WHITE;
            }
            return SimpleColor.GREEN;

        }

        if (P1.isPointRightOfParabola(x, y)) {
            return SimpleColor.WHITE;
        }
        if (P2.isPointAboveParabola(x,y)){
            return SimpleColor.YELLOW;
        }

        return SimpleColor.ORANGE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.1f, %.1f) -> %s%n", x, y, getColor(x, y));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите X: ");
        double x = scanner.nextDouble();
        System.out.print("Введите Y: ");
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
    }
}