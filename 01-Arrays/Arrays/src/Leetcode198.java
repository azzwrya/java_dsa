public class Leetcode198 {
    public int rob(int[] nums) {
        int rob=0;
        int norob=0;
        for(int i=0;i<nums.length;i++){
            int newrob=norob+nums[i];
            int newNoRob=Math.max(rob,norob);
            rob=newrob;
            norob=newNoRob;
        }
        return Math.max(rob,norob);
    }
}
