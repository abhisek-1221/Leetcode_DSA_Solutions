class Solution {
     public int search(int[]nums , int target)
    {
       int pivot= findPivot(nums);
       // if you don't find the pivot it means the array is not rotated
        if (pivot==-1)
        {
            // just do normal BS
            return binarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found then we have two ascending sorted arrays
        if (nums[pivot]==target)
        {  return pivot;}
             if (target>=nums[0])
             {return binarySearch(nums,target,0,pivot-1);}
             return binarySearch(nums,target,pivot+1,nums.length-1);
    }
     int binarySearch(int[] arr, int target,int start,int end)
    {
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

        }return -1;
    }
      int findPivot(int arr[])
    {
        int start=0;
        int end = arr.length-1;
        while (start<end)
        {
            int mid= start + (end-start)/2 ;
            // 4 cases over here
            if (mid>start && arr[mid] <arr[mid-1])
            {
                return mid-1;
            }
            if (mid<end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if (arr[mid]<= arr[start])
               end=mid-1;
            else {
                start= mid+1;
            }
        } return -1;
    }
}