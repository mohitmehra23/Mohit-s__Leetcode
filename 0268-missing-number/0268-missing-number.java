class Solution {
    public int missingNumber(int[] nums) {
  /*  Arrays.sort(nums);
        for(int i =0 ; i< nums.length; i++)
        {
          if(nums[i]!=i)
          {
            return i;
          }
          
        }
return nums.length; */
       int actualsum = 0;
       int totalsum = 0;

       for(int num : nums){
        actualsum += num;
       } 

       totalsum = nums.length*(nums.length + 1) /2;

       int missingnumber = totalsum - actualsum;

       return missingnumber;
    }
}