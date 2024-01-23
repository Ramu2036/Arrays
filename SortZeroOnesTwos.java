package ARRAYS;

public class SortZeroOnesTwos {
    public static void sorting(int a[]){
        int n = a.length;
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0;i<n;i++){
            if(a[i]==0){
                cnt0++;
            }
            else if(a[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for(int i = 0;i<cnt0;i++){
            System.out.print('0'+" ");
        }
        for(int i = cnt0;i<cnt0+cnt1;i++){
            System.out.print("1"+" ");
        }
        for(int i = cnt0+cnt1;i<n;i++){
            System.out.print("2"+" ");
        }
    }
    public static void main(String[] args) {
        int  a[] = {0,1,2,0,1,2,1,2,0,0,0,1};
        sorting(a);
    }
    
}
