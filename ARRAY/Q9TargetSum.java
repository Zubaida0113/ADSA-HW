package ARRAY;

public class Q9TargetSum {
    
    public static int[] findTargetSumWays(int[] nums, int target,int n) {
        int left=0, right=n-1,sum=0;

        while(left<right){
            sum= (nums[left] + nums[right]);
            if(sum==target){
                return new int[]{nums[left],nums[right]};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1}; // return -1 if no such pair exists`
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 5};
        int target = 3;
        int n= nums.length;
        int arr[]=findTargetSumWays(nums, target,n);
        if(arr[0]==-1){
            System.out.println("No such pair exists");
        }
        else{
            System.out.println("Pair found: " + arr[0] + ", " + arr[1]);
        }

    }
}
