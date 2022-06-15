public class fibonacci_series {
    static int a = 0, b = 1, c = 0;
    static void fibonacci_recursion(int t) {
        if(t>0){
            c= a+b;
            a=b; b=c;
            System.out.print(" "+c);
            fibonacci_recursion(t-1);
        }
    
    }

    static void fibonacci(int t) {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        while (t-- > 2) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int t = 15;
        fibonacci(t);
        System.out.println();
        fibonacci_recursion(t);
    }
}
