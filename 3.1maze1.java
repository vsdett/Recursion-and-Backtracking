import java.util.ArrayList;
import java.util.Arrays;

public class maze1 {
    public static void main(String[] args) {
     //System.out.println(maze(3,3));
     //System.out.println(mazePrint("",3,3));
     //System.out.println(mazePrintDiagonal("",3,3));
     int matrix[][]={{1,1,1},{1,1,1},{1,1,1}};
    
     System.out.println(mazeobstacle(matrix, 2, 2));
     System.out.println(mazeAlldirections(matrix, 2, 2));
     System.out.println(mazeAlldirections2("",matrix, 2, 2));
     int path[][]=new int[matrix.length][matrix[0].length];
     mazeCountAlldirections2("", matrix, 0, 0,path, 1);
    }
    public static int maze(int r,int c)
    {
       
        if((r<=0) || (c<=0))
        return 0;
        if(r==1 && c==1)
        {
            return 1;
        }
        int up=maze(r, c-1);
        int left=maze(r-1, c);
        
        return up+left;
    }
    public static ArrayList<String> mazePrint(String ans,int r,int c)
    {
        ArrayList<String> result=new ArrayList<>();
        if((r<=0) || (c<=0))
        return result;
        if(r==1 && c==1)
        {
            
            result.add(ans);
             return result;
        }
        ArrayList<String> up=mazePrint(ans+"U",r, c-1);
        ArrayList<String> left=mazePrint(ans+"L",r-1, c);
        up.addAll(left);
        return up;
    }
    public static ArrayList<String> mazePrintDiagonal(String ans,int r,int c)
    {
        ArrayList<String> result=new ArrayList<>();
        if((r<=0) || (c<=0))
        return result;
        if(r==1 && c==1)
        {
            
            result.add(ans);
             return result;
        }
        ArrayList<String> up=mazePrintDiagonal(ans+"U",r, c-1);
        ArrayList<String> left=mazePrintDiagonal(ans+"L",r-1, c);
        ArrayList<String> diagonal=mazePrintDiagonal(ans+"D",r-1, c-1);
        up.addAll(left);
        up.addAll(diagonal);
        return up;
    }
    public static int mazeobstacle(int matrix[][],int r,int c)
    {
       
        if((r<0) || (c<0))
        return 0;
        if(r==0 && c==0)
        {
            return 1;
        }
        if(matrix[r][c]==0)
        return 0;
        int up=mazeobstacle(matrix,r, c-1);
        int left=mazeobstacle(matrix,r-1, c);
        
        return up+left;
    }
    public static int mazeAlldirections(int matrix[][],int r,int c)
    {
       
        if((r<0) || (c<0))
        return 0;
        if((r>=matrix.length) || (c>=matrix[0].length))
        return 0;
        if(r==0 && c==0)
        {
            return 1;
        }
        if(matrix[r][c]==0)
        return 0;
        matrix[r][c]=0;
        int up=mazeAlldirections(matrix,r, c-1);
        int left=mazeAlldirections(matrix,r-1, c);
        int rigth=mazeAlldirections(matrix,r, c+1);
        int down=mazeAlldirections(matrix,r+1, c);
        matrix[r][c]=1;
        return up+left+rigth+down;

    }
    public static ArrayList<String> mazeAlldirections2(String ans,int matrix[][],int r,int c)
    {
        ArrayList<String> list=new ArrayList<>();
        if(r==0 && c==0)
        {
            list.add(ans);
            return list;
        }
        if(r<0 || c<0 || r>=matrix.length || c>=matrix[0].length)
        return list;
        if(matrix[r][c]==0)
        return list;
        matrix[r][c]=0;
        ArrayList<String> up=mazeAlldirections2(ans+"U", matrix, r-1, c);
        ArrayList<String> left=mazeAlldirections2(ans+"L", matrix, r, c-1);
        ArrayList<String> down =mazeAlldirections2(ans+"D", matrix, r+1, c);
        ArrayList<String> right=mazeAlldirections2(ans+"R", matrix, r, c+1);
        matrix[r][c]=1;
        up.addAll(right);up.addAll(left);up.addAll(down);
        list.addAll(up);
        return list;
    }
    public static void mazeCountAlldirections2(String ans,int matrix[][],int r,int c,int path[][],int step)
    {
        
        if(r==matrix.length-1 && c==matrix[0].length-1)
        {
            path[r][c]=step;
            for(int arr[]:path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return ;
        }
        if(r<0 || c<0 || r>=matrix.length || c>=matrix[0].length)
        return ;
        if(matrix[r][c]==0)
        return ;
        matrix[r][c]=0;
        path[r][c]=step;
       mazeCountAlldirections2(ans+"U", matrix, r-1, c,path,step+1);
        mazeCountAlldirections2(ans+"L", matrix, r, c-1,path,step+1);
       mazeCountAlldirections2(ans+"D", matrix, r+1, c,path,step+1);
        mazeCountAlldirections2(ans+"R", matrix, r, c+1,path,step+1);
        matrix[r][c]=1;
        path[r][c]=0;
    }
}
