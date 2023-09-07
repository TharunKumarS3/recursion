public class BinarSearchRecursion {
   
    public static void main(String[] args) {
         int[] nums={-1,0,3,5,9,12};
         int target=1;
         System.out.println(search(nums,target));
        
    }
    
    public static int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        
        int i=binarysearch(nums,s,e,target);
        return i;



    }
    public static int binarysearch(int nums[],int s,int e,int target)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(nums[m]==target)
        return m;
        if(nums[m]>target)
        {
           return binarysearch(nums, s, m-1, target);
        }
         if(nums[m]<target)
        {
           return  binarysearch(nums, m+1, e, target);
        }
        return s;
        



    }

    
}

