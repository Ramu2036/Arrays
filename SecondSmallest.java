package ARRAYS;

public class SecondSmallest {
    public static int second(int a[]){
        int n = a.length;
        int small = a[0];
        int ss = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(a[i]<small){
                ss = small;
                small = a[i];
            }
            else{
                if(a[i]!=small && a[i]<ss)
                return ss;
            }
        }
        return ss;
    }
    public static void main(String[] args) {
        int a[] = {2,1,3,5};
        int result = second(a);
        System.out.println(result);
    }
    
}
