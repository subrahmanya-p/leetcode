class Solution {
    public int longestOnes(int[] nums, int k) {
          int maxLength=0;
         int ZeroCount=0;
           int left=0;
            for( int  right=0; right<nums.length;right++){
                  if(nums[right]==0){
                    ZeroCount++;

                  }
                    while(ZeroCount>k){
                         if( nums[left]==0){
                        ZeroCount--;
                          }
                          left++;
                    }
                     int length= right-left+1;
                     maxLength =Math.max(length,maxLength);

            }
             return maxLength;
    }
}
