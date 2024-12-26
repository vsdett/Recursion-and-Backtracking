import java.util.ArrayList;

public class fourth {
    public static void main(String[] args) {
        System.out.println(dice2("", 4));
    }
     public static void permutations(String ans,String s)
    {
        if (s.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        for(int i=0;i<=ans.length();i++)
        {
            String first=ans.substring(0, i);
            String third=ans.substring( i,ans.length());
            permutations(first+ch+third, s.substring(1));
            
        }
    }
    public static ArrayList<String> permutations2(String ans,String s)
    {
        if (s.isEmpty()) {
          
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch=s.charAt(0);
        ArrayList<String> ans2=new ArrayList<>();
        for(int i=0;i<=ans.length();i++)
        {
            String first=ans.substring(0, i);
            String third=ans.substring( i,ans.length());
            ans2.addAll(permutations2(first+ch+third, s.substring(1)));
           // return ans2;
            
        }
        return ans2;
    }
    public static int permutationscount(String ans,String s)
    {
        if (s.isEmpty()) {
          
            return 1;
        }
        char ch=s.charAt(0);
        int count=0;
        for(int i=0;i<=ans.length();i++)
        {
            String first=ans.substring(0, i);
            String third=ans.substring( i,ans.length());
           count+=permutationscount( first+ch+third,s.substring(1));
            
        }
        return count;
    }
    public static void dice(String ans,int n)
    {
        if(n<=0)
        {
            System.out.print(ans+" ");
            return;
        }
        
        for(int i=1;i<=6 && i<=n;i++)
        {
            int ch=i;
            dice(ans+i, n-i);
        }
    }
     public static ArrayList<String> dice2(String ans,int n)
    {
        if (n<=0) {
          
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
         ArrayList<String> list2=new ArrayList<>();
        for(int i=1;i<=6 && i<=n;i++)
        {
            //int ch=i;
           list2.addAll(dice2(ans+i, n-i));
        }
        return list2;
    }
}
