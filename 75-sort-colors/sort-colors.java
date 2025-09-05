class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;  // reset flag for each outer loop pass
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    found = true;
                }
            }
            if (!found) {
                break; // array already sorted, exit early
            }
        }
    }
}
