public class Nknights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
       System.out.println( knights(board,0,0,4));
    }
    public static int knights(boolean[][] board,int row,int col,int target)
    {
        if(target==0)
        {
            display(board);
            System.out.println( );
            return 1;
        }
        if (row >= board.length) {
            return 0;
        }
        if (col == board.length) {
            return knights(board, row + 1, 0, target);
        }
        int count =0;
        if(isSafe(board,row,col))
        {
            board[row][col]=true;
            count+=knights(board, row, col+1, target-1);
            board[row][col]=false;
        }
        count+= knights(board, row, col+1, target); //if not safe,just move ahead
        return count;
    }
    static boolean isSafe(boolean[][] board,int row,int col)
    {
        if(isValid(board, row-2, col+1))
        {
            if(board[row-2][col+1])
            return false;
        }
        if(isValid(board, row-2, col-1))
        {
            if(board[row-2][col-1])
            return false;
        }
        if(isValid(board, row-1, col-2))
        {
            if(board[row-1][col-2])
            return false;
        }
        if(isValid(board, row-1, col+2))
        {
            if(board[row-1][col+2])
            return false;
        }
        return true;

    }
    static boolean isValid(boolean[][] board,int row,int col)
    {
        return (row>=0 && row<board.length && col>=0 && col<board.length);
        
    }
    static void display(boolean board[][])
    {
        for(boolean row[]:board)
        {
            for(boolean i:row)
            {
                if(i)
                System.out.print("K ");
                else
                System.out.print("X ");
            }
            System.out.println();
    }
        }
}
