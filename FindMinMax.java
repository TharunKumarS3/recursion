public class FindMinMax {
    public static void main(String args[])
    {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;
         
        // Function calling
        System.out.println(findMin(A, n));
        System.out.println(findMax(A, n));
    }
    static int findMin(int[] ans,int n)
    {
        if(n==1)
        return ans[0];

        return Math.min(ans[n-1], findMin(ans,n-1));
    }
     static int findMax(int[] ans,int n)
    {
        if(n==1)
        return ans[0];

        return Math.max(ans[n-1], findMax(ans,n-1));
    }
}
