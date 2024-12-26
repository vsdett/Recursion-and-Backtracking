public class second {
    public static void main(String[] args) {
        System.out.println("hi");
        String str="aaplesas";
        char ch=' ';
        //System.out.println(remove(str,"",ch,0));
        System.out.println(removeString(str));
    }
    // public static String remove(String str,String ans,char ch,int i)
    // {
    // if(i==str.length())
    // return ans;
    // if(str.charAt(i)==ch)
    // return  remove(str, ans, ch, i+1);
    // else
    //  return remove(str, ans+str.charAt(i), ch, i+1);
    // }
    // public static String remove(String str)
    // {
    //     if(str=="")
    //     return "";
    //     char ch=str.charAt((0));
    //     if (ch=='a') {
    //         return remove(str.substring((1)));
    //     }
    //     else
    //     return ch+remove(str.substring(1));
    // }
    public static String removeString(String str)
    {
        if(str=="")
        return "";
        //char ch=str.charAt((0));
        if (str.startsWith("ap")) {
            return removeString(str.substring((2)));
        }
        else
        return str.charAt(0)+removeString(str.substring(1));
    }
}
