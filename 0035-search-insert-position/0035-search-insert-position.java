class Solution {
    public int searchInsert(int[] arr, int target) {
        int start=0;
        int end= arr.length - 1;
        while(start<=end)
        {

            // find mid-element
            // int mid = (start+end)/2 //might be possible that(s + e) might exceed range of int in java
            int mid = start + (end - start)/2;
            if(target<arr[mid])
                end = mid - 1;
            else if (target>arr[mid]) {
                start = mid + 1;
            }
                else {
                    return mid;
                }

            }return start;
        }
}