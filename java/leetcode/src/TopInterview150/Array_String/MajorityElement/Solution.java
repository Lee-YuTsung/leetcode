package TopInterview150.Array_String.MajorityElement;

class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int max = 0;
        java.util.Arrays.sort(nums);
        int count = 0;
        int target = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                count++;
            }else{
                target = nums[i];
                count = 1;
            }
            max = count > max ? count : max;
            num = count >= max ? target : num;
        }

        return num;
    }
}
