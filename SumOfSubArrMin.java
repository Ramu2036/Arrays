package ARRAYS;

public class SumOfSubArrMin {
    public static int subArray(int a[]){
        int n = a.length;
        int result = 0;
        for(int i = 0;i<n;i++){
            int mini = Integer.MAX_VALUE;
            for(int j = i;j<n;j++){
                mini = Math.min(mini,a[j]);
                result+=mini;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {3,1,2,4};
        int result = subArray(a);
        System.out.println(result);
    }
}
