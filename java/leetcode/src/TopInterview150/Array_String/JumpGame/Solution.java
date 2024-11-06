package TopInterview150.Array_String.JumpGame;

class Solution {
    public boolean canJump(int[] nums) {
        return back(nums.length - 1, nums, false);
    }

    public static boolean jump(int index, int[] nums, boolean result){
        int i = nums[index];
        result = i + index >= nums.length - 1 ? true : false;

        while(i > 0 && result == false){
            result = jump(index + i, nums, result);
            i--;
        }

        return result;
    }

    public static boolean back(int end, int[] nums, boolean result){
        if(end == 0){
            return true;
        }
        for(int i = 0; i < end; i++){
            if(i + nums[i] >= end){
                end = i;
                result = back(end, nums, result);
            }
        }

        return result;
    }
}