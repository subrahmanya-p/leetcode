class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int maxCount=0;
        for( int i:  nums){

            if(i==1){
                max++;
            }
            else{
                max=0;
            }
            maxCount=Math.max(max,maxCount);
        }
        return maxCount;
    }
}
