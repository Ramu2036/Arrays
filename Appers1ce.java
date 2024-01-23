package ARRAYS;

public class Appers1ce {
    public static int one(int a[]){
        int n = a.length;
        int xorr = 0;
        for(int i = 0;i<n;i++){
            xorr = xorr^a[i];
        }
        return xorr;
    }
    public static void main(String[] args) {
        int a[] = {1,1,2,2,3};
        int result = one(a);
        System.out.println(result);
    }
    
}
