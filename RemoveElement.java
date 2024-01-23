package ARRAYS;

public class RemoveElement {
    public static int count(int a[],int val){
        int i = 0;
        int j = 0;
        while(i<a.length){
            if(a[i]!=val){
                a[j]=a[i];
                j = j+1;
            }
            i = i+1;
        }
        return j;
    }
    public static void main(String[] args) {
        int a[] = {3,2,2,3};
        int val = 3;
        int result = count(a, val);
        System.out.println(result);
    }
    
}
