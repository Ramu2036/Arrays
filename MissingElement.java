package ARRAYS;

public class MissingElement {
    public static int missing(int a[]){
        int n = a.length;
        int N = a[n-1];
        for(int i = 1;i<=N;i++){
            int flag = 0;
            for(int j = 0;j<N-1;j++){
                if(a[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,5};
        int result = missing(a);
        System.out.println(result);
    }
    
}
