public class MazeBackTrack {
    public static void main(String[] args) {
        boolean[][] maze={
            {true,false,true},
            {true,true,true},
            {true,true,true}
        };
        path("",maze,0,0);
    }
    static void  path(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
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
        //
        // same concept code below
        //
        if(r<maze.length-1)
        {
            path(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1)
        {
            path(p+'R', maze, r, c+1);
        }
        if(r>0)
        {
            path(p+'U', maze, r-1, c);

        }
        if(c>0)
        {
            path(p+'L', maze, r, c-1);

        }

        //
        //now u r abt to exit the particular recursion call
        //so u redo ur changes that u made in the beginning
        //
        maze[r][c]=true;

        //that's it //called backTracking

    }

    
}
