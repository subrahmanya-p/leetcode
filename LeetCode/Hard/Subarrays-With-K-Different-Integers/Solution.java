class Solution {
     
   public  int atMostK(int[] nums, int k) {
    if(k<=0){
        return 0;
    }
    int count=0;
   int left=0;
         HashMap<Integer, Integer> map= new HashMap<>();
         for(int i=0;i<nums.length;i++){
 map.put(nums[i], map.getOrDefault(nums[i],0)+1);
  while(map.size()>k){
    map.put(nums[left], map.get(nums[left])-1);
    if(map.get(nums[left])==0){
        map.remove(nums[left]);
    }
    left++;
  }
   count+=i-left+1;

         }
         return count;
   }


    public int subarraysWithKDistinct(int[] nums, int k) {
      return atMostK(nums,k)-atMostK(nums,k-1);


        
    }
}
