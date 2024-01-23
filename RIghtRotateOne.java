package ARRAYS;

public class RIghtRotateOne {
    public static int[] rotate(int a[]){
        int n = a.length;
        int temp = a[n-1];
        for(int i = n-2;i>=0;i--){
            a[i+1] = a[i];
        }
        a[0] = temp;
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int result[]  = rotate(a);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    
}
