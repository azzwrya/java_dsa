public class Leetcode59 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int a=1;
        int top=0;int bottom=n-1;int left =0;int right=n-1;

        while(top<=bottom && left <=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=a;
                a++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                arr[i][right]=a;
                a++;
            }
            right--;

            for(int i=right;i>=left;i--){
                arr[bottom][i]=a;
                a++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=a;
                a++;
            }
            left++;
        }
        return arr;

    }
}
