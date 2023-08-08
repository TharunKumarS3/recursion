public class LinearSearchRecur {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(lsearch(arr,7,0));
    }
    static boolean lsearch(int[] arr,int target,int index)
    {
        if(index==arr.length)
        return false;

        return arr[index]==target || lsearch(arr, target, index+1);
    }
    
}
