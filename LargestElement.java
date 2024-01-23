package ARRAYS;

import java.util.Arrays;
public class LargestElement {
    public static int largest(int a[]){
        Arrays.sort(a);
        return a[a.length-1]; 
    }
    public static void main(String[] args) {
        int a[] = {3,4,5,1,6};
        int result = largest(a);
        System.out.println(result);
    }

    
}
