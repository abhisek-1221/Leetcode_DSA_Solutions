class Solution {
   public int missingNumber(int[] nums)
    {
        int i=0;
        while (i<nums.length)
        {
            if (nums[i]<nums.length && nums[i]!= nums[nums[i]])
                swap(nums,i,nums[i]);
            else i++;
        }
        // search for missing element
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!= index)
                return index;
        } // case 2 
        return nums.length;
    }
    public void swap(int[]nums,int first,int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}