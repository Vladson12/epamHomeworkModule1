import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter size of sequence (even): ");
        int size = sc.nextInt();

        double[] nums = new double[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextDouble() * 100;
            System.out.println(i + ": " + nums[i]);
        }

        System.out.println("");
        double[] sums = new double[size / 2];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = nums[i] + nums[sums.length * 2 - 1 - i];
            System.out.println(i + ": " + sums[i]);
        }

        System.out.println("max = " + max(sums));

    }

    public static double max(double[] arr) {
        double res = Double.NEGATIVE_INFINITY;
        for (double d: arr) {
            if (d > res) res = d;
        }
        return res;
    }
}
