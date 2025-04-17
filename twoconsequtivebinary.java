//Find all the possible binary string that doesn't have Consecutive 1 or Consecutive 0
//the trick is to keep track of previous character bit in a string
//eg, if the prevbit is 1 then we don't add 1 and vice versa

import java.util.ArrayList;
import java.util.List;

public class twoconsequtivebinary {
     static class Solution {
      
      public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> list=new ArrayList<>();
        addBinaryStrings(n,"",list,'0');
        return list;
        
      }
      //fun to find all the string without consecutive 1
       private static void addBinaryStrings(int n,String curr,List<String> list,char prevbit){
          if(curr.length()==n){
              list.add(curr);
              return;
          }
          addBinaryStrings(n,curr+"0",list,'0');
          //adding 1 to the string if and only if the previous char. is not 1
          if(prevbit!='1'){
              addBinaryStrings(n,curr+"1",list,'1');
          }
       }


       public static List<String> generateBinaryString(int n) {
        // code here
        List<String> list=new ArrayList<>();
        addBinaryString(n,"",list,'1');
        return list;
      }
       //fun to find all the string without consecutive 0
       private static void addBinaryString(int n,String curr,List<String> list,char prevbit){
        if(curr.length()==n){
            list.add(curr);
            return;
        }
         //adding 0 to the string if and only if the previous char. is not 0
        if(prevbit!='0'){
        addBinaryString(n,curr+"0",list,'0');
        }
        addBinaryString(n,curr+"1",list,'1');
     }
    }
     public static void main(String[] args) {
        		int n = 3;
        		System.out.print(Solution.generateBinaryStrings(n)+" ");
            System.out.println();
            System.out.print(Solution.generateBinaryString(n)+" ");
            
        	}
  }
