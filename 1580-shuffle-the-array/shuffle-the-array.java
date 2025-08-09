class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] finalarray = new int[nums.length];
        int i=0,j=(nums.length)/2,k=0;
        while(i<(nums.length)/2&&j<nums.length&&k<nums.length){
            finalarray[k] = nums[i];
            i++;k++;
            finalarray[k]=nums[j];
            j++;k++;
        }
        return finalarray;        
    }
}