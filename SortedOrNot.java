package ARRAYS;

public class SortedOrNot {
    public static boolean sorted(int a[]){
        int n = a.length;
        for(int i = 1;i<n;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {1,3,2,1,5};
        boolean result = sorted(a);
        System.out.println(result);
    }
    
}
