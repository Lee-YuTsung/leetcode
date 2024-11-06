package TopInterview150.Array_String.RemoveDuplicatesfromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        java.util.Arrays.sort(nums);

        int result = 0;
        int i = 0;

        while(i < nums.length){
            if(nums[result] != nums[i]){
                nums[++result] = nums[i];
            }
            i++;
        }

        return ++result;
    }
}