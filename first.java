import java.util.ArrayList;
import java.util.Arrays;

class first{
public static void main(String args[])
{
//System.out.println(sum(123456));
System.out.println(reverse(12345,0));
System.out.println(reverse2(10908));
//System.out.println(countzeroes(12060550,0));
// int arr[]={3,6,181,19};
// System.out.println(sortedArray(arr,0));
int arr[]={3,1,8,4,3,1};
//ArrayList<Integer> ans=new ArrayList<>();
//System.out.println(searchElements(arr,6,0,ans));
//System.out.println(searchElements(arr, 0, 0));
//starPattern(4, 0);
// bubbleSort(arr,arr.length-1,0);
// selectionSort(arr,arr.length-1,0,0);
// selectionSort2(arr,arr.length-1,0,0);
// mergeSort(arr,0,arr.length-1);
// System.out.println(Arrays.toString(arr));
// arr[]={3,1,8,4,3,1};
//quickSort(arr,0,arr.length-1);
//System.out.println(Arrays.toString(arr));
}
// public static int sum(int n)
// {
//     if(n==0)
//     return 0;
    
//     return sum(n/10) +  n%10 ;
//     //System.out.println(n);
// }
public static int reverse(int n,int rev)
{
    if (n==0) {
        return rev;
    }
  rev=rev*10+n%10;
  return reverse(n/10, rev);
}
public static int reverse2(int n)
{
    if (n==0) {
        return 0;
    }
  int digits=(int)Math.log10(n)+1;
  return (n%10) * (int)Math.pow(10,digits-1) + reverse2(n/10);
}
// public static int countzeroes(int n,int ctr)
// {
// if(n==0)
// return ctr;
// if(n%10==0)
// ctr++;
// // return countzeroes(n/10,ctr+1);
// // else
// return countzeroes(n/10,ctr);
// }
// public static boolean sortedArray(int arr[],int index)
// {
// if(index==arr.length-1)
// return true;
// return arr[index]<arr[index+1] && sortedArray(arr, index+1);
// }
// public static ArrayList<Integer> searchElements(int arr[],int target,int index,ArrayList<Integer> ans)
// {
// if(index==arr.length)
// return ans;
// if(arr[index]==target)
// ans.add(index);
// return searchElements(arr, target, index+1, ans);
// }
// public static ArrayList<Integer> searchElements(int arr[],int target,int index)
// {
//     ArrayList<Integer> list=new ArrayList<>();
//     if(index==arr.length)
//     return list;
    
//     ArrayList<Integer> ans=searchElements(arr, target, index+1);
//     if(arr[index]==target)
//      ans.add(index);
//     list.addAll(ans);
//     return list;
// }
// public static void starPattern(int r,int c)
// {
//     if (r==0) {
//         return;
//     }
//     System.out.print("*");
//     if(r==c)
//     {
//         System.out.println();
//         //starPattern(r-1, 0);
//         r=r-1;c=0;
//     }
    
   
//     starPattern(r, c+1);
    

// }
// public static void bubbleSort(int arr[],int r,int c)
// {
//     if(r==0)
//   {System.out.println(Arrays.toString(arr));
//      return;}
//     if(r==c)
//     {
//         //System.out.println(Arrays.toString(arr));
//       // return;
//       r=r-1;c=0;
//     }
//  if(arr[c]>arr[c+1])
//  {
//     int temp=arr[c+1];
//     arr[c+1]=arr[c];
//     arr[c]=temp;
//  }
//  bubbleSort(arr, r, c+1);
// }
// public static void selectionSort(int arr[],int r,int c,int max)
// {
//     if(r==0)
//     {System.out.println(Arrays.toString(arr));
//       return;}
//      if(c>r)
//      {
//          //System.out.println(Arrays.toString(arr));
//         // return;
//         int temp=arr[max];
//       arr[max]=arr[r];
//       arr[r]=temp;
//         r=r-1;c=0;max=0;
//      }
//   if(arr[c]>arr[max])
//   {
//      max=c;
//      //arr[r]=arr[max];
//   }
//   selectionSort(arr, r, c+1,max);
// }
//  static void selectionSort2(int[] arr, int r, int c, int max) {
//       if(r==0)
//     {System.out.println(Arrays.toString(arr));
//       return;}
//         if (c < r) {
//             if (arr[c] > arr[max]) {
//                 selectionSort2(arr, r, c+1, c);
//             } else {
//                 selectionSort2(arr, r, c+1, max);
//             }
//         } else {
//             int temp = arr[max];
//             arr[max] = arr[r-1];
//             arr[r-1] = temp;
//             selectionSort2(arr, r-1, 0, 0);
//         }
//     }

// public  static void mergeSort(int arr[],int l,int h)
// {
//     if(l>=h)
//     return;
//     int mid=(l+h)/2;
//     mergeSort(arr,l,mid);
//     mergeSort(arr,mid+1,h);
//     merge(arr,l,mid,h);
    
// }
// public static void merge(int arr[],int l,int mid,int h)
// {
//     int right=mid+1;
//     int left=l;
//     ArrayList<Integer> ans=new ArrayList<>();
//     while(left<mid+1 && right<=h)
//     {
//         if(arr[left]<arr[right])
//         {ans.add(arr[left]);left++;}
//         else 
//          {ans.add(arr[right]);right++;}
        
//     }
//     while(left<=mid)
//     {ans.add(arr[left]);left++;}
//     while(right<=h)
//     {ans.add(arr[right]);right++;}
//     for(int i=l;i<=h;i++)
//     arr[i]=ans.get(i-l);
// }
// public static void quickSort(int arr[],int l,int h)
// {
//     if(l>=h)
//     return;
//     int index=partition(arr,l,h);
//     quickSort(arr,l,index-1);
//     quickSort(arr,index+1,h);
// }
// public static int partition(int arr[],int l,int h)
// {
//     int pivot=l;
//     int i=l,j=h;
//     while(i<j)
//     {
//         while(i<=h-1 && arr[i]<arr[pivot])
//         i++;
//         while(j>=l+1 && arr[j]>arr[pivot])
//         j--;
//         if(i<j)
//         {
//             swap(arr,i,j);
//         }
//     }
//     swap(arr,j,pivot);
//     return j;
    
// }
// public static void swap(int arr[],int a,int b)
// {
//     int temp=arr[a];
//     arr[a]=arr[b];
//     arr[b]=temp;
// }
}