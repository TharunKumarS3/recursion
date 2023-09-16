import java.util.Arrays;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(numSquares(5));
    }
    public static int numSquares(int n) {
        int[] memo = new int[n + 1];
        int c=helper(n, memo);
         System.out.println(Arrays.toString(memo));
         return c;
    }
    
    public static int helper(int n, int[] memo) {
        if (n < 4)
            return n;
        
        if (memo[n] != 0)
            return memo[n];
        
        int ans = n;
        
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            ans = Math.min(ans, 1 + helper(n - square, memo));
        }
        System.out.println(Arrays.toString(memo));
        
        return memo[n] = ans;
    }
    
}
