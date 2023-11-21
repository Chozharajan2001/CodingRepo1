class ConsecutiveOne {
    /*
     * Given a binary array nums, return the maximum number of consecutive 1's in
     * the array.
     * 
     * Example 1:
     * 
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive
     * 1s. The maximum number of consecutive 1s is 3.
     * Example 2:
     * 
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0, prev = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                prev = Math.max(count, prev);
                count = 0;
            }

        }
        prev = Math.max(count, prev);
        return prev;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int array[] = { 1, 0, 1, 1, 0, 1 };
        System.out.println(findMaxConsecutiveOnes(array));

    }
}