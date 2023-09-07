import java.util.Arrays;

public class SumTriangle
{
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }

    public static void printTriangle(int[] ans)
    {
        if(ans.length<1)
        {
            return;
        }
        int[] temp=new int[ans.length-1];
        for(int i=0;i<ans.length-1;i++)
        {
            temp[i]=ans[i]+ans[i+1];
        }
        printTriangle(temp);

        System.out.println(Arrays.toString(ans));
    }
}