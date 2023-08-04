public class NoOfSteps {
    public static void main(String[] args) {
        System.out.println(count(41));
    }
    static int count(int n)
    {
        return helper(n,0);
    }
    static int helper(int n,int c)
    {
        if(n==0)
        return c;

        if(n%2==0)
        return helper(n/2, c+1);

        return helper(n-1, c+1);
    }
    
}
