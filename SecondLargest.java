package ARRAYS;

import java.util.Arrays;
public class SecondLargest {
    public static int largest(int a[]){
        int n = a.length;
        Arrays.sort(a);
        int sl = 0;
        for(int i = n-2;i>=0;i--){
            if(a[i]!=a[n-1]){
                sl = a[i];
                break;
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int result = largest(a);
        System.out.println(result);
    }
    
}
