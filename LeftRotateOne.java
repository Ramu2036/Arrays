package ARRAYS;

public class LeftRotateOne {
    public static int[] rotate(int a[]){
        int n = a.length;
        int temp = a[0];
        for(int i = 1;i<n;i++){
            a[i-1] = a[i];
        }
        a[n-1] = temp;
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int result[] = rotate(a);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
