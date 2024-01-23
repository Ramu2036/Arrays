package ARRAYS;

public class Intersection {
    public static int[] intersect(int a1[],int a2[]){
        int n = a1.length;
        int m = a2.length;
        boolean vis[] = new boolean[m];
        int ans[] = new int[Math.min(n,m)];
        int index = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(a1[i]==a2[j] && !vis[j]){
                    ans[index++] = a1[i];
                    vis[j] = true;
                    break;
                }
                if(a2[j]>a1[i]){
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a1[] = {1,2,3,4};
        int a2[] = {1,2,3};
        int res[] = intersect(a1, a2);
        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    
}
