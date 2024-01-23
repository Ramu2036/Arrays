package ARRAYS;

public class MaxConsecutives {
    public static int max(int a[]){
        int n = a.length;
        int cnt = 0;
        int maxi = 0;
        for(int i = 0;i<n;i++){
            if(a[i]==1){
                cnt++;
            }
            else{
                cnt = 0;
            }
            maxi = Math.max(maxi,cnt);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int a[] = {1,1,1,0,1,1,0,1};
        int result = max(a);
        System.out.println(result);
    }
    
}
