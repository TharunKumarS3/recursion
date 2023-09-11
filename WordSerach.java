public class WordSerach {
    public static void main(String[] args) {
        // char[][]board = {{'A','B','C','E'},
        //                 {'S','F','C','S'},
        //                 {'A','D','E','E'}};
        // String word="SADF";

        char[][]board = {{'A'}};
        String word="A";
        System.out.println(exist(board,word));
        
    }
     public static boolean exist(char[][] board, String word) {

      //  char end=word.charAt(word.length()-1);
     

        for(int i=0;i<=board.length-1;i++)
        {
            for(int j=0;j<=board[0].length-1;j++)
            {
                if(board[i][j]==word.charAt(0) && check("",board,word,i,j))
                {
                     return true;
                 }
            }

        }
        
        return false;
        
    }
    static boolean check(String p,char[][]maze,String up,int r,int c)
    {

        if(up.length()<1)
        {
           // System.out.println(p);
        return true;
        }
        if(maze[r][c]!=up.charAt(0) || Character.isLowerCase(maze[r][c]) )
        {
            return false;
        }
        maze[r][c]=(char)(maze[r][c]+32);

        if(r<maze.length-1 && (maze[r][c]-32)==up.charAt(0))
        {
            if(check(p+"d",maze, up.substring(1), r+1, c))
            return true;
            
        }
         if(c<maze[0].length-1 && (maze[r][c]-32)==up.charAt(0))
        {
             if(check(p+"r",maze, up.substring(1), r, c+1))
             return true;
        }
        if(r>0 && (maze[r][c]-32)==up.charAt(0))
        {
            if(check(p+"u",maze, up.substring(1), r-1, c))
            return true;
        }
          if(c>0 && (maze[r][c]-32)==up.charAt(0))
        {
            if(check(p+"l",maze, up.substring(1), r, c-1))
            return true;

        }
        maze[r][c]=(char)(maze[r][c]-32);

        return false;

    }
    
}
