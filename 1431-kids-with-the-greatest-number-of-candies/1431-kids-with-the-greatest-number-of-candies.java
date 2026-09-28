class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      ArrayList<Boolean> list = new ArrayList<>();

        int maxcandies = candies[0];
        int currentcandies = 0;

        for(int i = 1 ; i < candies.length ; i++){
    
        currentcandies = candies[i];
        maxcandies  = Math.max(maxcandies , currentcandies);
        }

        for(int i = 0 ; i < candies.length ; i++){
          candies[i] += extraCandies;

          if(candies[i] >= maxcandies)
          list.add(true);

          else
         list.add(false);

        }
        return list;
    }
}