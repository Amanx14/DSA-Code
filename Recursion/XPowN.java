import java.util.ArrayList;

public class XPowN {
    public static double solve(double x, long n) {
        if(n==0) {
            return 1;
        }
        if(n < 0) {
            return solve(1/x, -n);
        }

        double temp = solve(x, n/2);
        if(n % 2 == 0) {
            return temp * temp;
        }
        return x * temp * temp;
    }
    public static double myPow(double x, int n) {
        return solve(x, (int)n);
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(myPow(x, n));
    }
}
