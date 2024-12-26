public class sudoku {
    public static void main(String[] args) {
        int board[][]={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }
    public static boolean solve(int board[][])
    {
        int row=-1;
        int col=-1;
        boolean empty=true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==0)
                {
                    row=i;
                    col=j;
                    empty=false;
                    break;
                }

            }
            if(empty==false)
            break;
        }
        if (empty==true) {
            return true;
        }
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    public static boolean isSafe(int board[][],int row,int col ,int num)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==num)
            return false;
            if(board[i][col]==num)
            return false;
            
        }
        int sqrt=(int)Math.sqrt(board.length);
            int rowstart=row-row%sqrt;
            int colstart=col-col%sqrt;
            for(int r=rowstart;r<rowstart+sqrt;r++)
            {
                for(int c=colstart;c<colstart+sqrt;c++)
                {
                    if(board[r][c]==num)
                    return false;
                }
            }
            return true;
    }
    static void display(int board[][])
    {
       for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
       }
    }
        
}
