/**
 * sumOfDIgits
 */
public class sumOfDIgits {
    public static void SumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 12345;
        SumDigits(n);
    }
}