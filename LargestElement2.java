package ARRAYS;

public class LargestElement2 {
    public static int lasrget(int a[]){
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a []={1,2,3,4,7,9};
        int result = lasrget(a);
        System.out.println(result);
    }
    
}
