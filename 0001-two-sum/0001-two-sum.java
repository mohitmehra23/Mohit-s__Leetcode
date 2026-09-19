class Solution {
    public int[] twoSum(int[] nums, int target) {
   /*    // List<Integer> index = new ArrayList<>();
      for(int i =0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
                //index.add(i);
                //index.add(j);
               // return new int[]{index.get(0),index.get(1)};
            }
        }
      }
     return new int[]{};
    }*/
    HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0; i<nums.length; i++)
      {
        int complement = target - nums[i];
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(nums[i],i);
      }
      return new int[]{};
}
}