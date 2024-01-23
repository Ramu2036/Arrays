package ARRAYS;

public class LongestSubArray1 {
    public static int longest(int a[],int target){
        int n  = a.length;
        int len = 0;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum = sum+a[j];
                if(sum == target){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int a[]= {1,2,3,1,1,1,1,4,3,2};
        int target = 3;
        int result = longest(a, target);
        System.out.println(result);
    }
    
}
