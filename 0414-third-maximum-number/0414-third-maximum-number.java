class Solution {
    public int thirdMax(int[] nums) {
        int firstDistinct = Integer.MIN_VALUE;
        int secondDistinct = Integer.MIN_VALUE;
        int thirdDistinct = Integer.MIN_VALUE;
        boolean isChanged = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > firstDistinct) {
                firstDistinct = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > secondDistinct && nums[i] < firstDistinct) {
                secondDistinct = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= thirdDistinct && nums[i] < secondDistinct) {
                thirdDistinct = nums[i];
                isChanged = true;
            }
        }
        if(!isChanged) {
            return firstDistinct;
        }
        return thirdDistinct;
    }
}
