package ARRAYS;

public class KthMissing {
    public static int kim(int a[],int k){
        int n = a.length;
        for(int i = 0;i<n;i++){
            if(a[i]<=k){
                k++;
            }
            else{
                break;
            }
        } 
        return k;

    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int k = 2;
        System.out.println(kim(a, k));
    }
    
}
