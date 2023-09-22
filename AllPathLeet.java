import java.util.ArrayList;
import java.util.List;

public class AllPathLeet {
    public static void main(String[] args) {
        int[][] graph =  {{4,3,1},{3,2,4},{3},{4},{}};
        System.out.println(allPathsSourceTarget(graph));
    }
   
    public static List<List<Integer>> allPathsSourceTarget(int[][] g) {
        List<List<Integer>> nm=new ArrayList<List<Integer>>();
        ArrayList<Integer> kk=new ArrayList<>();
        kk.add(0);
        task(g,nm,kk,0);
        return nm;
    }
    static void task(int[][] g , List<List<Integer>> kk , ArrayList<Integer> p , int s)
    {
        if(s==g.length-1)
        {
            kk.add(new ArrayList<>(p));
        }
        for(int f:g[s])
        {
            p.add(f);
            task(g,kk,p,f);
            p.remove(p.size()-1);
        }
    }

}
