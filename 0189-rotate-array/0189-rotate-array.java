class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=nums.length;
            rotate_it(nums, 0, n - k);
            rotate_it(nums, n - k, nums.length);
            rotate_it(nums, 0, nums.length);
    }
    public static void rotate_it(int [] nums, int start , int end){
        int temp;
        while (start<end){
            temp = nums[end-1];
            nums[end-1] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
        
    }
}