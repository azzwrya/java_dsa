public class Leetcode989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr= new ArrayList<>();
        int n=num.length;
        int i=n-1;

        while(i>=0 || k>0){
            if(i>=0){
                arr.add(0,(num[i]+k)%10);
                k=(num[i]+k)/10;
                i--;
            }
            else{
                arr.add(0,k%10);
                k=k/10;
            }
        }

        return arr;






    }
}
