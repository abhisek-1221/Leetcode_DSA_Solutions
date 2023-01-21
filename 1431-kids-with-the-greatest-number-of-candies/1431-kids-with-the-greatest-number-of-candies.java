class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          ArrayList<Boolean> arr2= new ArrayList<>(candies.length);

        int max = Integer.MIN_VALUE;
        for (int j = 0; j < candies.length; j++) {
            if(candies[j]>max)
                max=candies[j];
        }
        for (int i = 0; i < candies.length ; i++) {
            int temp = 0;
                    temp=candies[i]+extraCandies;
            arr2.add(i,(temp>=max));

        }
           return arr2;
    }
}