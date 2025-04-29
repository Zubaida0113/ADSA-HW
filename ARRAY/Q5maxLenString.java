package ARRAY;

import java.util.HashSet;

public class Q5maxLenString {
    
    // Function to find the maximum length of substring with all distinct characters    
    // O(n) time complexity
    // O(1) space complexity
    private static int findMaxLength(String s,int n) 
    {
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();
        int start=0;
        int end=0;

        while(end<n){
            char currChar= s.charAt(end);
            if(!set.contains(currChar)){
                set.add(currChar);
                maxLen=Math.max(maxLen,end-start+1);
                end++;
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcded";
        int n=str.length();
        int maxLength = findMaxLength(str,n);
        System.out.println("Maximum length of substring with all distinct characters: " + maxLength);
    }
}
