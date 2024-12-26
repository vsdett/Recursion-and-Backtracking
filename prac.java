import java.util.*;
public class Main{
    public static void main(String[] args)
     {
  print1("",3,3);
  System.out.println();
 System.out.println(print2("",3,3));
    }
         public static void print1( String ans,int r,int c)
         {
            if(r==1 && c==1)
          { 
              System.out.print(ans+" ");
               return ;
          }
            if(r<1 || c<1)
            return ;
           print1(ans+"L",r, c-1);
            print1(ans+"U",r-1, c);
         }
         public static ArrayList<String> print2(String ans,int r,int c)
         {
             if(r==1 && c==1)
             {
                 ArrayList<String> temp=new ArrayList<>();
                 temp.add(ans);
                 return temp;
             }
             ArrayList<String> list=new ArrayList<>();
             if(r>0)
             {
                 list.addAll(print2(ans+"L",r-1,c));
             }
              if(c>0)
             {
                 list.addAll(print2(ans+"U",r,c-1));
             }
             return list;
         }
         
}
