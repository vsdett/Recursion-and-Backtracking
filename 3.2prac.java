import java.util.ArrayList;
import java.util.List;

public class prac {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        ArrayList<Integer> ans=new ArrayList<>();
      //subsequence(ans,arr,0);
      //permutation("","abc");
      //permutationNum(arr, ans, 0);
       List<Integer> anss = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(0); // Initialize with placeholders
        }
        boolean[] used = new boolean[nums.length];
        permutation( anss,nums, used, 0);
     
    }
   public static void subsequence(ArrayList<Integer> ans,int arr[],int idx)
   {
    if(idx==arr.length)
    {
        System.out.print(ans+" ");
        return;
    }
    ans.add(arr[idx]);
    subsequence(ans,arr,idx+1);
   ans.remove(ans.size()-1);
    subsequence(ans,arr,idx+1);
   }
   public static void permutation(String ans,String s)
   {
    if(s.isEmpty())
    {
        System.out.println(ans+" ");
        return;
    }
  char ch=s.charAt(0);
  for(int i=0;i<=ans.length();i++)
  {
    String first=ans.substring(0,i);
    String third=ans.substring(i,ans.length());
    permutation(first+ch+third, s.substring(1));
  }
   }
    public static void permutationNum(int arr[],ArrayList<Integer> ans,int idx)
    {
        if(idx==arr.length)
        {
         System.out.println(ans);
         return;
        }
        for(int i=0;i<arr.length;i++)
        {
            ans.add(arr[i]);
            permutationNum(arr, ans, idx+1);
            ans.remove(ans.size()-1);
        }
    }
    public static void permutation(List<Integer> anss, int[] nums, boolean[] used, int pos) {
        // Base case: If the position equals the size of the array, print the permutation
        if (pos == nums.length) {
            for (int num : anss) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        // Loop through all numbers in the array
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                // Mark the number as used
                used[i] = true;
                anss.add(nums[i]);

                // Recur to the next position
                permutation(anss, nums, used, pos + 1);
                anss.remove(anss.size()-1);
                // Backtrack: Unmark the number as used
                used[i] = false;
            }
        }
    }
}
