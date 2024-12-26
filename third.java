import java.util.ArrayList;

public class third {
    public static void main(String[] args) {
       // subsequence("abs",0,"");
       skipchar("abccdae","");
       System.out.println(skipchar("abccdae"));
       System.out.println(skipApple("bccappled"));
       subsequence2("", "ans");
       System.out.println(subsequence3("", "abc"));
       System.out.println(Asciisubsequence3("", "abc"));
       
    }
    // public static void subsequence(String s,int idx,String ans)
    // {
    // if(idx==s.length())
    // {
    //     System.out.println(ans);
    //     return;
    // }
    // char ch=s.charAt((idx));
    // subsequence(s, idx+1, ans+ch);
    // subsequence(s, idx+1, ans+"_");

    // }
    public static void skipchar(String s,String ans)
    {
        if(s.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        if(ch=='a')
        skipchar(s.substring(1), ans);
        else
        skipchar(s.substring(1), ans+ch);
    }
    public static String skipchar(String s)
    {
        
        if(s.isEmpty())
        {
           
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a')
       return  skipchar(s.substring(1));
        else
        return ch+skipchar(s.substring(1));
    }
    public static String skipApple(String s)
    {
        
        if(s.isEmpty())
        {
           
            return "";
        }
        //char ch=s.charAt(0);
        if(s.startsWith("apple"))
       return  skipApple(s.substring(5));
        else
        return s.charAt(0)+skipApple(s.substring(1));
    }
    public static void subsequence2(String ans,String s)
    {
        if(s.isEmpty())
        {
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        subsequence2(ans+ch, s.substring(1));
        subsequence2(ans+"-", s.substring(1));
    }
    public static ArrayList<String> subsequence3(String ans,String s)
    {
        if(s.isEmpty())
        {
           ArrayList<String> list=new ArrayList<>();
           list.add(ans);
           return list;
        }
        char ch=s.charAt(0);
        ArrayList<String> left= subsequence3(ans+ch,s.substring(1));
       ArrayList<String> right= subsequence3( ans,s.substring(1));
        left.addAll(right);
        return left;
    }
    public static ArrayList<String> Asciisubsequence3(String ans,String s)
    {
        if(s.isEmpty())
        {
           ArrayList<String> list=new ArrayList<>();
           list.add(ans);
           return list;
        }
        char ch=s.charAt(0);
        
        ArrayList<String> take= Asciisubsequence3(ans+ch,s.substring(1));
        ArrayList<String> takeint= Asciisubsequence3(ans+(ch+0),s.substring(1));
       ArrayList<String> notTake= Asciisubsequence3( ans,s.substring(1));
        take.addAll(takeint);
        take.addAll(notTake);
        return take;
    }
   
}

