import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        
        List<List<Integer>> al=combinationSum3(3, 7);
       
            System.out.println(al);
    }
        public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();

        backTrack(1, k, n, new ArrayList<>(), result);

        return result;
    }

    private static void backTrack(int start, int k, int n, List<Integer> curr, List<List<Integer>> result) {
        if(n == 0 && k == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if(k == 0)
            return;

        for(int i = start; i < 10; ++i) {
            curr.add(i);
            backTrack(i + 1, k - 1, n - i, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
