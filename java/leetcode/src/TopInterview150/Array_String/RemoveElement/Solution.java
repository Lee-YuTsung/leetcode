package TopInterview150.Array_String.RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int i = 0;

        while(i < nums.length){
            result = nums[i] != val ? result + 1 : result;
            nums[i] = nums[i] != val ? nums[i] : 100;
            i++;
        }

        java.util.Arrays.sort(nums);

        return result;
    }
}