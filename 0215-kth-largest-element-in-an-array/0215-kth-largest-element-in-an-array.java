class Solution {
    public int findKthLargest(int[] nums, int k) {
     /*   Arrays.sort(nums);
        return(nums[nums.length-k]);*/
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int klargest=0;
        for(int value: nums)
        {
        pq.add(value);
        
       if(pq.size()>k)
        pq.poll();
        }
        klargest=pq.peek();
        return klargest;
    }
}