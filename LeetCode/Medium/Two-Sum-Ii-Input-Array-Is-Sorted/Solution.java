class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int []  temp  = new int [2];
          int left=0;
          int right = numbers.length-1;
         while(left<right ){
            int sum=numbers[left]+numbers[right];  
             if(sum==target){
                 temp[0]=left+1;
                 temp[1]=right+1;
                 return temp;

                  
             }
             else if(sum<target){
                left++;
             }
             else{
                right --;
             }
            
                   }
                   return temp;
        
    }
}
