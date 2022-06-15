public class PrintPrimeNumebr {
    public static boolean printPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 47;
        for (int i = 0; i <= n; i++) {
            if (printPrime(i))
                System.out.print(i + " ");
        }
    }
}
