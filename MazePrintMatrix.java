import java.util.Arrays;

public class MazePrintMatrix {
    public static void main(String[] args) {
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path=
        {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        int step=1;
        allPath("",maze,0,0,path,step);
    }
    static void allPath(String p,boolean[][] maze,int r,int c,int[][]path,int step)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            path[r][c]=step;
            for(int[] ans:path)
            {
                System.out.println(Arrays.toString(ans));

            }
            System.out.println(p);
            System.out.println();
            return;
        }
         if(!maze[r][c])
        {
            return ;
        }
        //
        // u r going to new cell so mark it as visited or false
        //

        maze[r][c]=false;
        path[r][c]=step;
        //
        // same concept code below
        //
        if(r<maze.length-1)
        {
            allPath(p+'D', maze, r+1, c,path,step+1);
        }
        if(c<maze[0].length-1)
        {
            allPath(p+'R', maze, r, c+1,path,step+1);
        }
        if(r>0)
        {
           allPath(p+'U', maze, r-1, c,path,step+1);

        }
        if(c>0)
        {
           allPath(p+'L', maze, r, c-1,path,step+1);

        }

        //
        //now u r abt to exit the particular recursion call
        //so u redo ur changes that u made in the beginning
        //
        maze[r][c]=true;
        path[r][c]=0;
        //that's it //called backTracking


    }
    
}
