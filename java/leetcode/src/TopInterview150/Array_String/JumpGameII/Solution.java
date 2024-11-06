package TopInterview150.Array_String.JumpGameII;

class Solution {
    public int jump(int[] nums) {
        return back(nums.length - 1, nums, 0);
    }

    public static int back(int end, int[] nums, int result){
        if(end == 0){
            return result;
        }
        for(int i = 0; i < end; i++){
            if(i + nums[i] >= end){
                end = i;
                result = back(end, nums, result + 1);
            }
        }

        return result;
    }
}