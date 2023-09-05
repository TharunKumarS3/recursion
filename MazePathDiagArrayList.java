import java.util.ArrayList;

public class MazePathDiagArrayList {
    public static void main(String[] args) {
        System.out.println(path("", 3, 3));
        
    }
    static ArrayList <String> path(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1 && c>1)
        {
             ans.addAll(path(p+"Di", r-1, c-1));
        }

        if(r>1)
        {
            ans.addAll(path(p+'D', r-1, c));
        }
        if(c>1)
        {
            
            ans.addAll(path(p+'R', r, c-1));
        }
        return ans;

    }

}
