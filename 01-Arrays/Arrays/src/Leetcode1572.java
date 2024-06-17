public class Leetcode1572 {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum=sum+ mat[i][i];
        }

        for(int j=0;j<mat.length;j++){
            if(j!=mat.length-j-1){
                sum=sum+mat[j][mat.length-j-1];
            }
        }


        return sum;
    }
}
