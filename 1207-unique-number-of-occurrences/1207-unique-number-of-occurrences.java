class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, (map.getOrDefault(num,0)+1));
        }
        // Create a HashSet and add all values of the map.
        // HashSet stores only unique values.
        // If the HashSet size is equal to the map size, it means every key has a unique value.
        boolean uniqueValues = map.size() == new HashSet<>(map.values()).size();
       
        return uniqueValues;
    }
}