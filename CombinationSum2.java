import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
          int[] ans={1,2,3,4,5,6,7,8,9};
        int t=9;
        List<List<Integer>> al=combinationSum2(ans, t);
       
            System.out.println(al);
    }
   
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        backTrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private static void backTrack(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> result) {
        if(target == 0 && curr.size()==4)  {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i < candidates.length; ++i) {
            if(i > start && candidates[i] == candidates[i - 1])
                continue;

            if(candidates[i] > target)
                break;

            curr.add(candidates[i]);
            backTrack(candidates, target - candidates[i], i + 1, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

}
