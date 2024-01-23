package ARRAYS;

public class MoveZeros1 {
    public static int[] one(int a[]){
        int n = a.length;
        int j = -1;
        for(int i = 0;i<n;i++){
            if(a[i]==0){
                j = i;
                break;
            }
        }
        for(int i = j+1;i<n;i++){
            if(a[i]!=0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1,0,2,0,3,0};
        int r[] = one(a);
        for(int i = 0;i<r.length;i++){
            System.out.print(r[i] +" ");
        }
    }
}
