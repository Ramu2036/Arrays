package ARRAYS;

public class KedansAlgorithm {
    public static int kedans(int a[]){
        int n = a.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=a[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = kedans(a);
        System.out.println(result);
    }
}
