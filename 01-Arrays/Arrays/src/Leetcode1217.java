public class Leetcode1217 {
    public int minCostToMoveChips(int[] position) {
    int e=0;int o=0;
    for(int i=0;i<position.length;i++){
        if (position[i]%2==0){
            e++;
        }
        else o++;

    }

    if(e==position.length || o==position.length){
        return 0;
    }

    else {return Math.min(e,o);}
}
}
