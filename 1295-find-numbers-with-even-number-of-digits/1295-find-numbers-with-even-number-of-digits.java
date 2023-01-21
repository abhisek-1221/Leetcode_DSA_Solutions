class Solution {
     public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {

        int c = 0, k = 0;
        for (int i = 0; i < nums.length; i++) {
            {
                int temp = nums[i];
                while (temp > 0) {
                    temp /= 10;
                    c++;
                }
                if (c % 2 == 0) {
                    k++;
                }
                c = 0;
            }
        }
        return k;
    }
}