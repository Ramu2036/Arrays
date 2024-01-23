package ARRAYS;

public class MoorsVoting {
    public static int voting(int a[]){
        int n = a.length;
        int cnt = 0;
        int element = 0;
        for(int i  = 0;i<n;i++){
            if(cnt==0){
                cnt++;
                element = a[i];
            }
            else if(a[i]==element){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i = 0;i<n;i++){
            if(a[i]==element){
                cnt1++;
            }
        }
        if(cnt1>n/2){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {2,2,1,1,1,2,2};
        int result = voting(a);
        System.out.println(result);
    }
    
    
}
