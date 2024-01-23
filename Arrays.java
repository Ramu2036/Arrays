package ARRAYS;

public class Arrays {
    public static int[] array(int a[]){
        int n = a.length;
        for(int i = 0;i<n;i++){
            System.out.println(a[i]);
        }
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int result[] = array(a);
        // for(int i = 0;i<result.length;i++){
        //     System.out.println(result[i]);
        // }
    }
    public static void sort(int[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
    public static Object asList(int i, int j, int k, int l, int m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}
