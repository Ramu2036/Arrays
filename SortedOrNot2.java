package ARRAYS;

public class SortedOrNot2 {
    public static boolean sorted9(int a[]){
        int n = a.length;
        for(int i = 0;i<n;i++){
            for(int j = 1;j<n;j++){
                if(a[j]<a[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {1,3,4,5,1};
        boolean result = sorted9(a);
        System.out.println(result);
    }
    
}
