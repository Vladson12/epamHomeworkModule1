public class Task2 {
    public static void main(String[] args) {
        double eps = 1.0E-3;
        double value = 0.0;

        int i = 1;
        while ((value = 1 / Math.pow(i + 1, 2)) > eps) {
            System.out.println("a[" + i++ + "] = " + value);
        }
        System.out.println("a[" + i + "] = " + value);
    }
}
