public class seiveOfEratostanes {
    public static void checkPrime(int n) {

        boolean p[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            p[i] = true;

        }

        for (int i = 2; i * i <= n; i++) {
            if (p[i] == true) {
                for (int j = i * i; j <= n; j += i)
                    p[j] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (p[i] == true) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        int n = 100;
        checkPrime(n);
    }
}