package ARRAYS;

public class SecondLargest3 {
    public static int largest(int a[]){
        int n = a.length;
        int largest = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE+1;
        for(int i = 0;i<n;i++){
            if(a[i]>largest){
                sl = largest;
                largest = a[i];
            }
            else{
                if(a[i]>largest && a[i]<sl){
                    return sl;
                }
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int result = largest(a);
        System.out.println(result);
    }
    
}
