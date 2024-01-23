package ARRAYS;

public class LinearSerach {
    public static int linear(int a[]){
        for(int i = 0;i<a.length;i++){
            if(a[i] == 4){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int result = linear(a);
        System.out.println(result);
    }
    
}
