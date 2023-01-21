class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[j] = nums[i];
            arr[j + 1] = nums[i + n];
            j+=2;
        
    } return arr;
}
}