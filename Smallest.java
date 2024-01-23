package ARRAYS;

public class Smallest {
    public static int smallest(int a[]){
        int n = a.length;
        int small = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(a[i]<small){
                small = a[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int result = smallest(a);
        System.out.println(result);

    }
    
}
