import java.util.ArrayList;
import java.util.List;

public class twoconsequtivebinary {
    class Solution {
    public static List<String> generateBinaryStrings(int n) {
      // code here
      List<String> list=new ArrayList<>();
      addBinaryStrings(n,"",list,'0');
      return list;
      
    }
     private static void addBinaryStrings(int n,String curr,List<String> list,char prevbit){
        if(curr.length()==n){
            list.add(curr);
            return;
        }
        addBinaryStrings(n,curr+"0",list,'0');
        if(prevbit!=1){
            addBinaryStrings(n,curr+"1",list,'1');
        }
     }
     public static void main(String[] args) {
        		int n = 3;
        		System.out.print(generateBinaryStrings(n)+" ");
            
        	}
  }
}
