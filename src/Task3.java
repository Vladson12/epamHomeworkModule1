import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range");
        System.out.print("Left border: " );
        double a = sc.nextDouble();
        System.out.print("Right border: " );
        double b = sc.nextDouble();
        System.out.print("Enter step: ");
        double h = sc.nextDouble();

        System.out.println("y = tg(2x) - 3");
        for (double x = a; x < b; x += h) {
            System.out.println("x = " + x + ",  y = " + func(x));
        }
        System.out.println("x = " + b + ",  y = " + func(b));


    }

    public static double func(double x) {
        return Math.tan(2 * x) - 3;
    }
}
