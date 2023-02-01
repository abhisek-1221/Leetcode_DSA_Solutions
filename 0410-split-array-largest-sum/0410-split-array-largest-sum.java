class Solution {
   public int splitArray(int[] nums, int m)
    {
        int start=0;
        int end=0;
        for (int i = 0; i <nums.length ; i++) {
            start= Math.max(start,nums[i]); // inm the end of loop this will contain the max item from the array
            end+=nums[i];// case 2 where max value was the sum of all elements oif entire array
        }
        //binary search
        while(start<end) {
            // try for the mid as potential answer
            int mid = start + (end - start) / 2;
            // calculate how many pieces you can divide this in with maz sum      
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid)
                {   // you cannot add this subarray ,make new one
                    // say you add this io new subarray , then sum=num
                    sum = num;
                pieces++; }
            else{
                    sum += num;
                }
            }
            if (pieces>m)
                start=mid+1;
            else end=mid;
        }
        return  end; // here start==end

    }

}
