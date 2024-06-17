public class Leetcode1499 {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max =Integer.MIN_VALUE;
        int c=0;
        int flag=1;
        for(int i=0;i<points.length-1;i++){
            if(flag<i+1){
                flag=i+1;
            }
            for (int j=flag;j<points.length;j++){

                if(Math.abs(points[i][0]-points[j][0])<=k){

                    if(points[i][0]-points[j][0]<0){
                        c=(points[i][0]-points[j][0])*-1;
                    }
                    else c=(points[i][0]-points[j][0]);
                    int d=0;
                    d=points[j][1]+points[i][1]+c;
                    if(d>max){
                        max=d;
                        flag=j-1;

                    }


                }
            }
        }
        return max;
    }
}
