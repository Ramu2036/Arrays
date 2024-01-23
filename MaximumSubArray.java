package ARRAYS;

public class MaximumSubArray {
    public static int subarray(int a[]){
        int n = a.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int sum = 0;
                for(int k =i;k<=j;k++){
                    sum+=a[k];
                    maxi = Math.max(maxi,sum);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = subarray(a);
        System.out.println(result);
    }
    
}
