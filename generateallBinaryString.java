import java.util.ArrayList;
import java.util.List;
//Using array
// public class generateallBinaryString
// {
// 	private static void  printbinarystring(int n,int arr[], int i) {
//         //BASE CASE: if length of temporary arr is equal to length of binary string -> print the array and return
// 		if(i==n) {
// 		    print(arr,n);
// 		    return;
// 		}
//         //start with 0 and run function recursively for adjacent place 
//         //and once the base case is reached we backtrack the recursive tree and go for arr[i] = 1
// 		arr[i] = 0;
// 		printbinarystring(n,arr,i+1);
//         //do the same with 1
// 		arr[i] = 1;
// 		printbinarystring(n,arr,i+1);
// 	}
// 	static void print(int arr[], int n)
// 	{
// 		for (int i = 0; i < n; i++)
// 		{
// 			System.out.print(arr[i]+" ");
// 		}
// 		System.out.println();
// 	}
// 	public static void main(String[] args) {
// 		int n = 3;
// 		int[] arr = new int[n];
// 		printbinarystring(n,arr,0);
// 	}
// }

//using arraylist
class Solution {
    public static List<String> generateBinaryStrings(int n) {
      // code here
      List<String> list=new ArrayList<>();
      addBinaryStrings(n,"",list);
      return list;
      
    }
     private static void addBinaryStrings(int n,String curr,List<String> list){
        if(curr.length()==n){
            list.add(curr);
            return;
        }
        addBinaryStrings(n,curr+"0",list);
        addBinaryStrings(n,curr+"1",list);
     }
     public static void main(String[] args) {
        		int n = 3;
        		System.out.print(generateBinaryStrings(n)+" ");
        	}
  }
      