package ARRAYS;

public class AppearsOnluOnce {
    public static int appear(int a[]){
        int n = a.length;
        for(int i = 0;i<n;i++){
            int cnt = 0;
            for(int j = 0;j<n;j++){
                if(a[i]==a[j]){
                    cnt++;
                }
            }
            if(cnt==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,1,2,3,3};
        int res = appear(a);
        System.out.println(res);
    }
    
}
