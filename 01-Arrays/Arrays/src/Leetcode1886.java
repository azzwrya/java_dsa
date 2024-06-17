public class Leetcode1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        int c=0;
        boolean flag = false;
        while(c<4){

            for(int i=0;i<mat.length;i++){
                for(int j=i;j<mat.length;j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }

            }
            for(int i=0;i<mat.length;i++){
                int j=0;
                int k=mat.length-1;
                int temp;
                while(j<k){
                    temp=mat[i][j];
                    mat[i][j]=mat[i][k];
                    mat[i][k]=temp;
                    j++;
                    k--;
                }
            }

            loop: for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat.length; j++){
                    if(mat[i][j] != target[i][j]){
                        flag = false;
                        break loop;

                    }
                    else{
                        flag=true;
                    }


                }

            }

            if(flag){
                return true;
            }


            c++;

        }
        return false;


    }
}
