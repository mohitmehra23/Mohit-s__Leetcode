class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++){         // we cant use another data structure because
            if(nums[i]!=nums[j]){                 // its mentioned in the question that we have
                i++;                              // to modify the existing array(in-place)
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
}