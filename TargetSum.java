import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        int[] nums={1,0};
        int target=1; 
        System.out.println(findTargetSumWays(nums, target));
        
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int sum=0,index=0;
        int count=helper(nums,index,target,sum);
        return count;
        

    }
    static int helper(int[] nums,int ind,int target,int sum)
    {
       
        if(ind==nums.length )
        {
            if(sum==target)
            return 1;
            else
            return 0;
        }

      
     
        int l=helper(nums, ind+1,target, sum+nums[ind]);
        int r=helper(nums, ind+1,target, sum-nums[ind]);
                    

        return l+r;
        
    }
}
