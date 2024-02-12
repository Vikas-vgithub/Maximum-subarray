class Solution {
    public int maxSubArray(int[] nums) {

        int result = Integer.MIN_VALUE;
        int prevsum = 0;
        for(int i=0; i<nums.length; i++){
               prevsum += nums[i];
               result = Math.max(result, prevsum);  

               if(prevsum<0){
                   prevsum=0;
               }          
        }
        return result;
        
    }
}
