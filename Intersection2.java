package ARRAYS;

public class Intersection2 {
    public static int[] inter(int a[],int b[],int n,int m){
        int i = 0;
        int j = 0;
        int ans[] =new int[n];
        while(i<n && j<m){
            if(a[i]<b[j]){
                i++;
            }
            else if (b[j]>a[i]) {
                j++;
            }
            else{
                ans[i] = a[i];
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {1,2,3};
        int n = 3;
        int m = 3;
        int r[] = inter(a, b, n, m);
        for(int i = 0;i<n;i++){
            System.out.print(r[i]+" ");
        }
    }
    
}
