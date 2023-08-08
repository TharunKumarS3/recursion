public class SearchInSortedArray {
    public static void main(String[] args) {
        
                int[] arr={5,6,7,8,9,1,2,3};
                System.out.println(ssort(arr,0));
            }
            static boolean ssort(int[] arr,int index)
            {
                if(index==arr.length-1)
                return true;
        
                return arr[index]<arr[index+1] &&  ssort(arr,  index+1);
            }
            
    
}
