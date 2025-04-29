package ARRAY;

//Prefix Sum Array: Find the sum of elements in a given range [L, R] using a prefix sum array.
//Time Complexity: O(n) for prefix, O(1) per query 
//Space Complexity: O(n) 
public class Q1prefixSum {

    private static void prefixSum(int a[],int n){
        int p[]= new int[n];
        p[0]=a[0];  
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(p[i]+" ");
        }
        System.out.println();

        // range queries
        System.out.println(p[4]); //O(1)
  }

    private static int rangeSumQuery(int a[],int L,int R){
        int p[]= new int[a.length];
        p[0]=a[0];  
        for(int i=1;i<a.length;i++){
            p[i]=p[i-1]+a[i];
        }
        return (L==0)?p[R]:p[R]-p[L-1];
    }
    public static void main(String[] args) {
        int a[]={2,3,-1,6,-3};
        int n=a.length;
        
        System.out.println("Prefix Sum Array:");
        prefixSum(a,n);

        // Example of range sum query
        int L=1;
        int R=3;
        int rangeSum = rangeSumQuery(a,L,R);
        System.out.println("Range Sum Query from index " + L + " to " + R + ": " + rangeSum);
        
        }
}   
