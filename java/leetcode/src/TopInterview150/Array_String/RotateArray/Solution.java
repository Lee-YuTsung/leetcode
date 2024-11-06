package TopInterview150.Array_String.RotateArray;

class Solution {
    public void rotate(int[] nums, int k) {
        int l = k % nums.length;
        if(l < nums.length){
            int[] temp = java.util.Arrays.copyOfRange(nums, 0, nums.length - l);
            for(int i = 0; i < nums.length; i++){
                nums[i] = i < l ? nums[nums.length - l + i] : temp[i - l];
            }
        }
        
    }
}