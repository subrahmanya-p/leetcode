
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int Maxsum =0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {

            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
             set.add(nums[right]);
                sum += nums[right];
                if(right-left+1>k){
                    set.remove(nums[left]);
                sum -= nums[left];
                left++; 
                }

                 if(right-left+1==k){
                    Maxsum=Math.max(sum,Maxsum);
        }
        }
        return Maxsum;
    }
}
